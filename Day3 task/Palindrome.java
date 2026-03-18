import java.util.Scanner;
public class Palindrome{
    public static void main(String [] args){
        Scanner  sc= new Scanner(System.in);
        int num=sc.nextInt();
        int original =num;
        int reverse=0;
         while (num > 0) {
            int digit = num % 10;     // get last digit
            reverse = reverse * 10 + digit; // build reverse
            num = num / 10;           // remove last digit
        }

        if (original == reverse) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}