import java.util.Scanner;
public class Maxsubarray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] =new int[n];
        for(int i=0; i < n;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=arr[0];
        int Cusum=arr[0];
        for (int i = 1; i < n;i++){
            Cusum=Math.max(arr[i],Cusum + arr[i]);
            maxsum=Math.max(maxsum,Cusum);
        }
        System.out.println(maxsum);
    }
}
