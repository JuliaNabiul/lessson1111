package ext;

public class Dog extends Animals implements AnimalColor{
    public Dog(String name) {
        super(name);
    }

    public void say() {
        System.out.println("Gav");
    }

    @Override
    public void getColor() {
        System.out.println("Green");
    }
}
