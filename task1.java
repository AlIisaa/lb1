import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = in.nextInt();
        System.out.print("Введите второе число: ");
        b = in.nextInt();
        System.out.print("Введите третье число: ");
        c = in.nextInt();
        System.out.print("Введите четвертое число: ");
        d = in.nextInt();

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("Наименьшее число - " + a);
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("Наименьшее число - " + b);
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("Наименьшее число - " + c);
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("Наименьшее число - " + d);
        }
    }
}

