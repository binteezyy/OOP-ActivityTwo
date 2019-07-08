package activity102;
import java.io.*;

public class PanganibanACM_Act102Exer17 {
	 public static void main(String[] args) throws IOException{
	        int[][] image  = {
	            {0,0,0,0,0,0,0,0,0,0,0,0}, 
	            {0,0,0,0,0,0,0,0,0,0,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,5,5,5,5,5,5,5,5,0,0}, 
	            {0,0,0,0,0,0,0,0,0,0,0,0}, 
	            {0,0,0,0,0,0,0,0,0,0,0,0}
	        };
	        
	        int[][] smooth = new int[image.length][image[0].length];
	        int sum = 0; 
	        for(int row = 1; row < image.length - 1; row++){
	            for(int col = 1; col < image[row].length - 1; col++){
	                sum = (image[row - 1][col - 1] + image[row - 1][col] + image[row - 1][col + 1] + image[row][col - 1] + image[row][col] + image[row][col + 1] + image[row + 1][col - 1] + image[row + 1][col] + image[row + 1][col + 1]);
	                smooth[row][col] = sum / 9;
	            }  
	        }   
	        
	        System.out.println("Input: ");
	        for(int row = 0; row < image.length; row++){
	            for(int col = 0; col < image[row].length; col++){
	                System.out.print(image[row][col] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
	        System.out.println("Output: ");
	        for(int row = 0; row < smooth.length; row++){
	            for(int col = 0; col < smooth[row].length; col++){
	                System.out.print(smooth[row][col] + " ");
	            }
	            System.out.println();
	        }
	        
	    }
}
