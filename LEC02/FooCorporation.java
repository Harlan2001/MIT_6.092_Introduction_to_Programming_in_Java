package LEC02;

public class FooCorporation {
    public static void wage(double pay, int hours) {
        if (pay < 8.0) {
            System.out.println("error");
            return;
        }
        if (hours <= 40) {
            System.out.println("The wage is " + (pay * hours));
            return;
        } else if (hours <= 60) {
            System.out.println("The wage is " + (pay * 40 + 1.5 * pay * (hours - 40)));
            return;
        } else {
            System.out.println("error");
            return;
        }
    }

    public static void main(String[] args) {
        wage(7.5, 35);
        wage(8.2, 47);
        wage(10.0, 73);

    }
}
