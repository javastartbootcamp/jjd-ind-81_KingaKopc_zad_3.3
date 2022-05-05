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









    }
    public static int getInt() {

        return 0;
    }


}