import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Java file");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        fun(s.next());
        feature();
    }

    public static void fun(String name) {
        System.out.println("Hi " + name);
        System.out.println("Welcome to this page " + name);
    }

    public static void feature() {
        System.out.println("New feature");
    }
}