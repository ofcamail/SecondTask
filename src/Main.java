public class Main {

    public static void main(String[] args) {
        int number = 10;
        double FirstNumberToCompare = 9.45;
        double SecondNumberToCompare = 8.5;
        boolean IsSecondNumberCloser = (SecondNumberToCompare > FirstNumberToCompare && SecondNumberToCompare < number && FirstNumberToCompare < number);
        boolean IsFirstNumberCloser = (FirstNumberToCompare > SecondNumberToCompare && FirstNumberToCompare < number && SecondNumberToCompare < number);
        if (IsFirstNumberCloser) {
            System.out.println("Число " + FirstNumberToCompare + " ближе к 10 по значению.");
        } else if (IsSecondNumberCloser) {
            System.out.println("Число " + SecondNumberToCompare + " ближе к 10 по значению.");
        } else {
            System.out.println("Некорректное условие. Проверяемые числа не должны быть равны друг другу, заданному числу или превышать значение заданного числа. " +
                    "Задайте другие значения.");
        }
    }
}