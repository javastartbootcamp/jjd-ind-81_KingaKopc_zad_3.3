import static java.lang.System.*;

public class MathFunctions {
    public static void main(String[] args) {

        Math math = new Math();
      //  int result1 = math.isEven();
        boolean isEven = true;
        int number1 = 2;
        System.out.println("Proszę podać liczbę: " + number1);
        number1 = getInt();
        isEven = number1 % 2 == 0;
        System.out.println("Czy liczba jest parzysta?: " + isEven);

     //   int result2 = math.isOdd();
        boolean isOdd = true;
        int number2 = 1;
        System.out.println("Proszę podać liczbę: " + number2);
        number2 = getInt();
        isOdd = number2 % 2 == 1;
        System.out.println("Czy liczba jest parzysta?: " + isOdd);


        Circle circle = new Circle();
        int radius1 = 2;
        int radius = getInt();
        System.out.println("Proszę podać promień koła: " + radius1);

        double result4 = circle.getMathPi();
        out.println("Liczba Pi to stała i wynosi : " + result4);


        double result5 = circle.circleField(3.14, 2);
        System.out.println("Pole koła o tym promieniu wynosi: " + result5);

        Power power = new Power();
        int result6 = (int) power.power(3,2);
        System.out.println("Liczba " + power.first +
                           " podniesiona do potęgi "
                           + power.second + " to: "
                            + result6 + ".");
    }
    public static int getInt() {

        return 0;
    }
}