public class Ravenclaw extends hogwarts{
    private int mind;
    private int wise;
    private int witty;
    private int fullOffCreativity;

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int mind, int wise, int witty, int fullOffCreativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.mind= mind;
        this.wise = wise;
        this.witty = witty;
        this.fullOffCreativity = fullOffCreativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOffCreativity() {
        return fullOffCreativity;
    }

    public void setFullOffCreativity(int fullOffCreativity) {
        this.fullOffCreativity = fullOffCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() + "mind=" + mind + ", wise=" + wise + ", witty=" + witty + ", fullOffCreativity=" + fullOffCreativity + '}';
    }
}
