import java.util.Scanner;

public class Solution {
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String st;
        StringBuilder sb;
        for(int tc = 1; tc<=T; tc++) {
            st = sc.next();
            sb = new StringBuilder(st);
            sb = sb.reverse();
            System.out.print("#" + tc + " ");
            if(st.equals(sb.toString())) {
                System.out.println(1);
                continue;
            }
            System.out.println(0);
              
        }
    }
  
}