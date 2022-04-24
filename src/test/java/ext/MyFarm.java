package ext;


public class MyFarm {

    public static void main(String[] args) {
        Cat oli = new Cat("Oli");

        Dog dog1 = new Dog("Timur");

        Task2Pig rtg = new Task2Pig("Tinki");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();

        rtg.eat();
        System.out.println(rtg.getName());
        rtg.eat();
        rtg.getColor();
        rtg.getPopulation();

        System.out.println(dog1.getName());
        dog1.setName("Gerald");
        System.out.println(dog1.getName());
        dog1.setName("Gerald");
    }
}
