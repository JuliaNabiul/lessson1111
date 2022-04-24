package ext;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name=name;
    }

    public void eat() {
        System.out.println("omnomnom");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
