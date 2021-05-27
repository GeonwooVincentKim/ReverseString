import java.util.Scanner;

import static java.lang.System.out;

import java.io.File;
import java.io.FileWriter;

public class ArithmeticSequence {
    public static Scanner readFile(){
        Scanner readFile = null;
        File file = new File("data1.txt");

        try {
            readFile = new Scanner(file);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return readFile;
    }

    public static void writeFile(String getResult){
        try {
            FileWriter fileWriter = new FileWriter("result1.txt");
            fileWriter.write(getResult);
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getFile(Scanner fileReader){
        String result = "";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int readLine = Integer.parseInt(sc.nextLine());

        String getLine = "";
        int convertLine = 0;

        int sum = 0;

        for(int i = 0; i < readLine; i++){
            sum = 0;
            getLine = sc.nextLine();
            convertLine = Integer.parseInt(getLine);

            for(int j = 1; j <= convertLine; j++){
                if(j % 2 != 0){
                    sum += j;
                } else if(j % 2 == 0){
                    sum += j * -1;
                }
            }

            out.println(sum);
        }
        

        sc.close();
    }
}
