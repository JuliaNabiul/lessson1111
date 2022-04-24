package Task1;

public class Program {

    public static void main(String[] args) {

        // Оператор if
        int x = 30;

        if (x < 20)
        {
            System.out.println("оператор1");
        }
        else
        {
            System.out.println("оператор2");
        }

        // Цикл for
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }


        // Цикл do while
        do{
            System.out.print("Значение х: " + x );
            x++;
            System.out.print("\n");
        } while( x < 35 );


        // Оператор switch
        String color = "Blue";

        switch(color)
        {
            case "Red" :
                System.out.println("Your color is red");
                break;
            case "Green" :
                System.out.println("Your color is green");
                break;
            case "Blue" :
                System.out.println("Your color is blue");
                break;
            default :
                System.out.println("Color is not find");
        }
    }
}
