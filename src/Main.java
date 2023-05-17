public class Main {
    public static void main(String[] args) {
        hogwarts[] hogwarts = {
                new hogwarts("Harry", "Potter", 90, 80),
                new hogwarts("Hermione", "Granger", 100, 70),
                new hogwarts("Ron", "Weasley", 60, 90),
                new hogwarts("Draco", "Malfoy", 85, 75),
                new hogwarts("Graham" , "Montague", 95, 85),
                new hogwarts("Gregory", "Goyle", 60, 100 ),
                new hogwarts("Zachariah", "Smith", 75, 80),
                new hogwarts("Cedric", "Diggory", 90, 50),
                new hogwarts("Justin", "Finch-Fletchley", 65, 95),
                new hogwarts("Zhou", "Chang", 70, 100),
                new hogwarts("Padma", "Patil", 85, 85),
                new hogwarts("Marcus", "Belby", 85, 85)
        };

        Gryffindor[] gryffindor = new Gryffindor[]{
                new Gryffindor("Harry", "Potter", 90, 80, 50, 90, 100),
                new Gryffindor("Hermione", "Granger", 100, 70, 100, 40, 90 ),
                new Gryffindor("Ron", "Weasley", 60, 90, 55, 95, 100)
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Zachariah","Smith", 85,75, 80, 85, 90),
                new Hufflepuff("Cedric","Diggory", 95, 85, 65,75, 100),
                new Hufflepuff("Justin","Finch-Fletchley", 65, 95, 85, 70, 60),
        };
        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Draco","Malfoy", 85, 75, 60,75,100,55,90),
                new Slytherin("Graham","Montague", 95,85, 50,90,85,100,70),
                new Slytherin("Gregory","Goyle", 60,100,70,70,50,100,65),
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Zhou","Chang", 70,100,85,40,50,100),
                new Ravenclaw("Padma", "Patil", 85,85,60,85,100,70),
                new Ravenclaw("Marcus", "Belby", 85, 85, 100,95,70,60)
        };


        methods methods = new methods();
        methods.compareGryffindor(gryffindor[0], gryffindor[2]);
        methods.compareHufflepuff(hufflepuffs[1], hufflepuffs[2]);
        methods.compareRavenclaw(ravenclaws[0], ravenclaws[2]);
        methods.compareSlytherin(slytherins[0], slytherins[1]);
        methods.allHogwartsStudent(hogwarts[2], hogwarts[6]);
    }
    hogwardsPrinter printer = new hogwardsPrinter();
    for (hogwarts hogwarts: hogwarts){
        printer.print(hogwarts);
    }

}