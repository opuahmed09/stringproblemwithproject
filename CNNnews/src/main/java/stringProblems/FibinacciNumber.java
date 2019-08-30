package stringProblems;

import java.util.Scanner;

public class FibinacciNumber {


    public static void main(String[] args) {

        //  fibonacci(20);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive number :");

        int inputNumber = sc.nextInt();
        isFibonacciNumber(inputNumber);
    }

    public static void fibonacci(int num5) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i < num5; i++) {

            int temp = num1 + num2;
            System.out.println(temp);
            num1 = num2;
            num2 = temp;

        }
    }

    public static void isFibonacciNumber(int num) {

        int inputNumber = num;

        int firstTerm = 0;

        int secondTerm = 1;

        int thirdTerm = 0;

        while (thirdTerm < inputNumber) {
            thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;

            secondTerm = thirdTerm;
        }

        if (thirdTerm == inputNumber) {
            System.out.println("Number belongs to Fibonacci series");
        } else {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }

    }
    ///this is just for check
}
