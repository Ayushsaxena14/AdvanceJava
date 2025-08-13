// Practise questions on Exception handling

import java.util.*;
public class ExceptionHandling_6 {
    public static void problem_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Haha Arithmetic exception occurred");
        }
        try {
            Thread.sleep(-10);
        } catch (InterruptedException e) {
            System.out.println("Thread sleeping is interrupted");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe IllegalArgument exception occurred in Thread.sleep method negative argument can't be passed");
        }
    }

    public static class MaxretriesException extends Exception {
        @Override
        public String toString() {
            return "Max retries are exceeded";
        }

        @Override
        public String getMessage() {
            return "You can't try beyond now as max retries are exceeded";
        }
    }

    public static void problem_2() throws MaxretriesException {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        a[0] = 95;
        a[1] = 90;
        a[2] = 96;
        boolean flag = false;
        int c = 0;
        while (!flag && c <= 5) {
            System.out.println("Enter the index");
            int ind = sc.nextInt();
            try {
                System.out.println("Index is : " + ind);
                System.out.println("Value at ind is :" + a[ind]);
                flag = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of bound exception ocurred");
                c++;
                System.out.println("Attempt no : " + c);
            }
        }
        if (c > 5) {
            throw new MaxretriesException();
        }
    }

    public static void main(String[] args) {
        //problem_1();
        try {
            problem_2();
        } catch (MaxretriesException e)
        {
            System.out.println(e.getMessage());
        }
    }
}