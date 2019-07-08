package activity102;
import java.io.*;
public class PanganibanACM_Act102Exer16 {
	public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}
        };
        
        int temp = 0;
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length / 2; col++){
                temp = data[row][col];
                data[row][col] = data[row][data[row].length - 1 - col];
                data[row][data[row].length - 1 - col] = temp;
            }     
        }
        System.out.println("Reversed Data:");
        for(int row = 0; row < data.length; row++){
            System.out.print("{");
            for(int col = 0; col < data[row].length; col++){
                System.out.print(data[row][col]);
                if (col != data[row].length - 1) {
                	System.out.print(" ,");;
                }
            }
            System.out.print("}");
            if (row != data.length - 1) {
            	System.out.println(",");
            }
        }
    } 
}
