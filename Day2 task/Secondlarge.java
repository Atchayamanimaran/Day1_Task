import java.util.Scanner;
public class Secondlarge {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0 ;i< n;i++){
            arr[i]=sc.nextInt();
        }
        int large=Integer.MIN_VALUE;
        int Secondlarge=Integer.MIN_VALUE;
        for(int i=0;i < n;i++){
            if(arr[i] > large){
                Secondlarge =large;
                large=arr[i];
            }
            else if(arr[i] > Secondlarge && arr[i] != large){
                Secondlarge=arr[i];
            }
        }
        System.out.println(Secondlarge);
    }
}
