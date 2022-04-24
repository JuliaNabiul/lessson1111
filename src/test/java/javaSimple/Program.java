package javaSimple;

import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {
        int num=3;
        System.out.println("Hello world!");
        //System.out.println(HelpedMethods.name("word", 2));
        //System.out.println(HelpedMethods.parametr);
        System.out.println("Сумма="+num + " и " + num + " =" +HelpedMethods.sum(num,num));


        String qwe = new String("qwe");
        boolean result = qwe==HelpedMethods.parametr;
        System.out.println(result);

        boolean result2 = qwe.equalsIgnoreCase(HelpedMethods.parametr);
        System.out.println(result2);

        num = 5;

        if (result){
            System.out.println("Мы сделали это");
        } else if (num== 4) {
            System.out.println("Мы почти сделали это");
        } else {
            System.out.println("Ничего не сделано");
        }

        HelpedMethods hp = new HelpedMethods();
        System.out.println("radio = " + hp.switchRadio("Afro"));

        int index = 100;
        for (int x = 0; x<index;x++){
            x = x + 30;
            System.out.println(x);
        }

        int value=0;

        while (index<110){
            value++;
            System.out.println("Привет");
            if (value==4){
                break;
            }
        }

        do{
            System.out.println("Ghhdbhdb");
            index = 1000;
        } while (index<110);

        System.out.println("Мы закончили");

    }


}
