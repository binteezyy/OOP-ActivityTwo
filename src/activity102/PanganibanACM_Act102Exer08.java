package activity102;
import java.io.*;

public class PanganibanACM_Act102Exer08 {
	public static void main ( String[] args ) throws IOException{
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] result = new int[data.length];
		// reverse the data
		for ( int j=0; j < result.length; j++){
			result[j] = data[data.length - 1 - j];
		}
		// write out the new data
		System.out.print("Reversed data:");
		for ( int j=0; j < data.length; j++){
			System.out.print(" " + result[j]);
		}
	}
}
