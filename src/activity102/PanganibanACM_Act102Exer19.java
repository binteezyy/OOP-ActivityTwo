package activity102;

import java.util.*;
import java.io.*;

public class PanganibanACM_Act102Exer19 {
	public static void main(String[] args) throws IOException{
        File inputfile = new File("InputFile2.txt").getAbsoluteFile();
        File outputFile = new File("OutputFile2.txt").getAbsoluteFile();
        Scanner scan = new Scanner(inputfile);
        PrintWriter output = new PrintWriter(outputFile);
        
        char brightNess;
        
        while(scan.hasNextInt()){
            int input = scan.nextInt();
                        
            switch(input / 8){
                case 0: brightNess = ' ';
                break;
                case 1: brightNess = '.';
                break;
                case 2: brightNess = ',';
                break;
                case 3: brightNess = '-';
                break;
                case 4: brightNess = '+';
                break;
                case 5: brightNess = 'o';
                break;
                case 6: brightNess = 'O';
                break;
                case 7: brightNess = 'X';
                break;
                default: brightNess = '!';
                break;
            }
            
            for(int a = 1; a <= 128; a++){
                output.print(brightNess);
            }
            output.println();
                       
        }
        output.close();
        scan.close();
    }
}
