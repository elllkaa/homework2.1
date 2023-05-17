public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int right;
    private int honor;

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() + " hardworking=" + hardworking + ", right=" + right + ", honor=" + honor + '}';
    }

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int right, int honor) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.right = right;
        this.honor = honor;

    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }


}
