public class methods {
    private hogwarts Hogwarts;


    public void compareGryffindor(Gryffindor first, Gryffindor second) {
        var firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
        var secondPoints = second.getBravery() + second.getHonor() + second.getNobility();

        if(firstPoints >secondPoints) {
            System.out.println("Студент " + first.getName() + "" + first.getSurname() + " лучше чем " + second.getName() + "" + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + "" + second.getSurname() + " лучше чем " + first.getName() + "" + first.getSurname());
        } else {
            System.out.println("Студенты " + first.getName() + "" + first.getSurname() + " и "  + second.getName() + "" + second.getSurname());
        }

    };
    public void compareHufflepuff(Hufflepuff first, Hufflepuff second) {
        var firstPoints = first.getHardworking() + first.getRight() + first.getHonor();
        var secondPoints = second.getHardworking() + second.getRight() + second.getHonor();
        if(firstPoints >secondPoints) {
            System.out.println("Студент " + first.getName()  + first.getSurname() + " лучше чем " + second.getName() + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + second.getSurname() + " лучше чем " + first.getName() + first.getSurname());
        } else {
            System.out.println("Студенты " + first.getName() + first.getSurname() + " и "  + second.getName() + second.getSurname());
        }

    };
    public void  compareSlytherin(Slytherin first, Slytherin second) {
        var firstPoints =  first.getTrick() + first.getDetermination()+ first.getAmbition() + first.getResourcefulness() + first.getLustForPower();
        var secondPoints = second.getTrick() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getLustForPower();
        if(firstPoints >secondPoints) {
            System.out.println("Студент " + first.getName()  + first.getSurname() + " лучше чем " + second.getName() + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + second.getSurname() + " лучше чем " + first.getName() + first.getSurname());
        } else {
            System.out.println("Студенты " + first.getName() + first.getSurname() + " и "  + second.getName() + second.getSurname());
        }
    };
    public void compareRavenclaw(Ravenclaw first, Ravenclaw second) {
        var firstPoints = first.getMind() + first.getWise() + first.getWitty() + first.getFullOffCreativity();
        var secondPoints = second.getMind() + second.getWise() + second.getWitty() + second.getFullOffCreativity();
        if(firstPoints >secondPoints) {
            System.out.println("Студент " + first.getName()  + first.getSurname() + " лучше чем " + second.getName() + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + second.getSurname() + " лучше чем " + first.getName() + first.getSurname());
        } else {
            System.out.println("Студенты " + first.getName() + first.getSurname() + " и "  + second.getName() + second.getSurname());
        }
    }
    public void allHogwartsStudent (hogwarts first, hogwarts second) {
        var firstPoints = first.getMagicPower() + first.getTransgressionDistance();
        var secondPoints = second.getMagicPower() + second.getTransgressionDistance();
        if(firstPoints >secondPoints) {
            System.out.println("Студент " + first.getName()  + first.getSurname() + " лучше чем " + second.getName() + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + second.getSurname() + " лучше чем " + first.getName() + first.getSurname());
        } else {
            System.out.println("Студенты " + first.getName() + first.getSurname() + " и "  + second.getName() + second.getSurname());
        }

    }


}
