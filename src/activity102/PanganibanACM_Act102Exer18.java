package activity102;
import java.io.*;
import java.util.*;

public class PanganibanACM_Act102Exer18 {
	public static void main(String[] args) throws IOException{
        File inputFile = new File("InputFile.txt").getAbsoluteFile();
        File outputFile = new File("OutputFile.txt").getAbsoluteFile();
        Scanner scan = new Scanner(inputFile);
//        Scanner outputFile = new Scanner(System.in);
//        Scanner s = new Scanner(System.in);
//        String outfile = s.nextLine();
//        System.setOut(new PrintStream(new FileOut))
        PrintWriter output = new PrintWriter(outputFile);
        
        while(scan.hasNextInt()){
            int input = scan.nextInt();
            for(int a = 1; a <= 64; a++){
                output.print(input + " ");
            }
            output.println();
        }
        scan.close();
        output.close();
//        outputFile.close();
    }
}
