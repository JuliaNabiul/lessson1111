package ext;

public class Task2Pig extends Animals implements AnimalColor{

    int population =150;

    public Task2Pig(String name) {
        super(name);
    }

    public void say () {
        System.out.println("HRU-HRU");
    }

    public int getPopulation() {
        System.out.println("Популяция поросят "+population);
        return population;
    }

    @Override
    public void getColor()
    {
        System.out.println("Pink");
    }

}
