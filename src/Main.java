
// 4. С помощью Scanner - считать 2 целых (на ваш выбор) числа и добавить друг к другу.
//К примеру:
//1 число = 5
//2 число = -5
//Ответ который должна выдать программа - 0


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Input number please ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numbertwo = input.nextInt();
        int result = number-numbertwo;
        System.out.println(result);

    }
}