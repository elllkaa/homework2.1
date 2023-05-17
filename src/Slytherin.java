public class Slytherin extends hogwarts{
    private int  trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    @Override
    public String toString() {
        return "Slytherin{"  + super.toString() + " trick=" + trick + ", determination=" + determination + ", ambition=" + ambition + ", resourcefulness=" + resourcefulness + ", lustForPower=" + lustForPower + '}';
    }

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


}
