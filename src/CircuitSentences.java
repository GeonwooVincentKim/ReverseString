import java.util.Scanner;

import static java.lang.System.out;

public class CircuitSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String getData = "";
        String[] getDataArray = null;
        // String result = "";
        
        for (int i = 0; i < 3; i++) {
            boolean isIterate = true;

            out.println("입력===");
            getData = sc.nextLine();
            // out.println(getData[0]);
            // getDataArray = getData.split("");
            
            // for(int j = 0; j < getData.length(); j++){
            //     for(int k = 0; k < getData.length(); k++){
            //         if((j - k - 1) < getData.length() && getData.charAt(k) != getData.charAt(j - k - 1)){
            //             out.println("출력===");
            //             isIterate = false;
            //         }
            //     }

            //     if(isIterate){
            //         out.println("출력===");
            //         out.println(isIterate);
            //     }
            // }

            // result += getData + "\n" + isIterate + "\n";
            // result += "\n";
            // out.println("출력===");
            // out.println(isIterate);
        }

        // out.println("출력===");
        // out.println(result);
        sc.close();
    }
}
