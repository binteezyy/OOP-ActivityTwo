package activity102;
import java.io.*;

public class PanganibanACM_Act102Exer12 {
	public static void main(String[] args) throws IOException{
        int[][] data = {{3, 2, 5}, {1, 4, 4, 8, 13}, {9, 1, 0, 2}, {0, 2, 6, 3, -1, -8}};
        int sum;
        
        for(int row = 0; row < data.length; row++){
            sum = 0;
            for(int col = 0; col < data[row].length; col++){
                sum += data[row][col];
            }
            System.out.println("Sum of data row[" + row + "]: " + sum);
        }
    }
}
