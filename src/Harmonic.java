import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter n number : ");
        int n =input.nextInt();

        double result = 0 ;

        for( double  i=1 ; i<=n ; i++){
            result += (1/i);
        }
        System.out.println( result );



    }
}
