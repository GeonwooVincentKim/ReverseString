import java.util.Scanner;

import static java.lang.System.out;

import java.io.File;
import java.io.FileWriter;

public class TetTtest {
    public static void main(String[] args) {
        Scanner fileReader = new Scanner(System.in);
        int readLine = Integer.parseInt(fileReader.nextLine());

        String getLine = "";
        int convertLine = 0;

        int sum = 0;
        String result = "";

        for (int i = 0; i < readLine; i++) {
            sum = 0;
            getLine = fileReader.nextLine();
            convertLine = Integer.parseInt(getLine);

            for (int j = 1; j <= convertLine; j++) {
                if (j % 2 != 0) {
                    sum += j;
                } else if (j % 2 == 0) {
                    sum += j * -1;
                }
            }

            result += "#" + (i + 1) + " " + sum + "\n";
        }
        out.println(result);
    }
    // public static Scanner readFile() {
    // Scanner readFile = null;
    // File file = new File("input.txt");

    // try {
    // readFile = new Scanner(file);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // return readFile;
    // }

    // public static void writeFile(String getResult) {
    // try {
    // FileWriter fileWriter = new FileWriter("output.txt");
    // fileWriter.write(getResult);
    // fileWriter.close();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // public static String getFile(Scanner fileReader) {
    // int readLine = Integer.parseInt(fileReader.nextLine());

    // String getLine = "";
    // int convertLine = 0;

    // int sum = 0;
    // String result = "";

    // for (int i = 0; i < readLine; i++) {
    // sum = 0;
    // getLine = fileReader.nextLine();
    // convertLine = Integer.parseInt(getLine);

    // for (int j = 1; j <= convertLine; j++) {
    // if (j % 2 != 0) {
    // sum += j;
    // } else if (j % 2 == 0) {
    // sum += j * -1;
    // }
    // }

    // result += "#" + (i + 1) + " " + sum + "\n";
    // out.println(sum);
    // }

    // return result;
    // }

    // public static void main(String[] args) {
    // Scanner sc = readFile();
    // String getData = getFile(sc);
    // writeFile(getData);
    // sc.close();
    // }
}
