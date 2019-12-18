package homework1;

public class BigOne {
    public static void main(String[] args) {

        BigOne x = new BigOne();
        System.out.println("The biggest one is: " + x.number());
    }
    public static int number() {
        int a = 4;
        int b = 7;
        int c = 2;

        if(( a > b ) && ( a > c ))
            return a;

        else
        if( b > c )
            return b;
        else
            return c;
    }
}