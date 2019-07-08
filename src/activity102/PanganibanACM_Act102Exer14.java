package activity102;
import java.io.*;

public class PanganibanACM_Act102Exer14 {
	public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}};
        
        int max = 0, min = 0;     
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > max){
                    max = data[row][col];
                }
            }
        }
        
        min = max;
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                if(min > data[row][col]){
                    min = data[row][col];
                }
            }
        }
        
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
	}
}
