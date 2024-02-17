<<<<<<< HEAD
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
=======
public class MathFunctions {
    private static double circleField;

    public static void main(String[] args) {
        Math math = new Math();


        int number1 = 2;
        boolean isEven=true;
        System.out.println("Proszę podać liczbę:" + 2);
        number1 = getInt();
        isEven = number1 % 2 == 0;
        System.out.println("Czy liczba parzysta?: " + isEven);

        int number2 = 1;
        boolean isOdd=false;
        System.out.println("Proszę podać liczbę:" + 1);
        number2 = getInt();
        isEven = number2 % 2 == 1;
        System.out.println("Czy liczba parzysta?: " + isOdd);



        double result = math.circleField(3.14, 2);
        System.out.println("Podaj promien koła:" + 4);
        int radius = getInt();
        System.out.println("Pole kola o tym promieniu wynosi: " + 12.56);

        math.power(3,2);
        System.out.println("Liczba " + 3 + " podniesiona do potęgi " + 2 + " to: " + 9);









>>>>>>> origin/solution16.02
    }
    public static int getInt() {

        return 0;
    }
<<<<<<< HEAD
=======


>>>>>>> origin/solution16.02
}