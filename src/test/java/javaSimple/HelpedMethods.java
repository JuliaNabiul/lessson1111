package javaSimple;

public class HelpedMethods {

    final static String parametr = "qwe";

    public int ind = 2;

    public static String name(String word, int value) {
        String nameForReturn = word;
        return nameForReturn;
    }

    private String prefix (String pref) {
        return pref;
    }

    protected String sufix(String suf) {
        return suf;
    }

    String lost() {
        return "lost";
    }

    static int sum (int a, int b) {
        return a+b;
    }

    public String switchRadio(String radioName) {
        String radio;
        switch (radioName) {
            case "Afro":
                radio = "100.2";
                break;
            case "Auto":
                //int a = 3;
                radio = "106.1";
                break;
            default:
                radio = "Мы не знаем этого радио";
        }
        return radio;
    }

    public String switchRadioNewWave(String radioName){
        String radio;

        radio = switch (radioName) {
            case "Afro"->"100.2";
            case "Auto"-> "106.1";
            default -> "Мы не знаем этого радио";
        };
        return radio;
    }
}
