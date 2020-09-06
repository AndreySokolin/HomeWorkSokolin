package lesson1;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;


public class Main {


    public static void main(String[] args) {


        int valA = 7;
        int valB = 3;
        int result;
        result = 7 + 3;
        System.out.println(result);

        double doubleA = 7.0;
        double doubleB = 3.0;
        double doubleC = 10.0;
        double doubleD = 5.0;
        double doubleResult = doubleA * (doubleB + (doubleC / doubleD));
        System.out.println(doubleResult);


        char ch = 'a';
        char ch2 = 32131;
        boolean isTrue = false;
        int c = 0;
        c = c + 1;
        c += 1;
        c *= 3;
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);


        int apple = 75;
        int orange = 50;
        result = result;
        if (apple > orange) {
            System.out.println("Яблок больше на " + c);
        } else if (apple < orange) {
            System.out.println("Апельсинов больше на" + c);
        } else {
            System.out.println("Vso ok");
        }

    }

    static int comparisionFruit(int apple, int orange) {

        int result = Math.abs(apple - orange);
        return result;


    }


}

