public class Main {

    public static void main(String[] args) {
        int number = 5;
        double firstNumberToCompare = 9.45;
        double secondNumberToCompare = 8.5;
        boolean isSecondNumberCloser = (secondNumberToCompare > firstNumberToCompare && secondNumberToCompare < number && firstNumberToCompare < number);
        boolean isFirstNumberCloser = (firstNumberToCompare > secondNumberToCompare && firstNumberToCompare < number && secondNumberToCompare < number);
        if (isFirstNumberCloser) {
            System.out.println("Число " + firstNumberToCompare + " ближе к " + number + " по значению.");
        } else if (isSecondNumberCloser) {
            System.out.println("Число " + secondNumberToCompare + " ближе к " + number + " по значению.");
        } else {
            System.out.println("Некорректное условие. Проверяемые числа не должны быть равны друг другу, заданному числу или превышать значение заданного числа. " +
                    "Задайте другие значения.");
        }
    }
}