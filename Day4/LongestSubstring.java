import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            String temp = "";
            for(int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(temp.contains(ch + "")) {
                    break;  
                }
                temp = temp + ch;
            }
            if(temp.length() > max) {
                max = temp.length();
            }
        }
        System.out.println(max);
    }
}