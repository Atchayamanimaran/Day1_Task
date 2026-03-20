import java.util.*;
public class Squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        int right = n;
        int ans = 0;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(mid * mid == n) {
                System.out.println("Square Root: " + mid);
                return;
            }
            else if(mid * mid < n) {
                ans = mid;          
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("Square Root (approx): " + ans);
    }
}