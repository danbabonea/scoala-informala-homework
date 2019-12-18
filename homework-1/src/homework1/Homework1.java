package homework1;

public class Homework1 {
    public static void main(String[] args) {

        Homework1 x = new Homework1();
        System.out.println("Sum of the first 100 numbers is: " + x.count());
    }

    public static int count() {
        int a = 1;
        int b = 100;
        int sum = 0;

        while ( a <= b ) {
            sum += a;
            a++;
        }
        return sum;
    }

}
