package activity102;
import java.io.*;

public class PanganibanACM_Act102Exer06 {
	public static void main ( String[] args ) throws IOException
	{
	int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
	// declare and initialize three sums
	int sumAll = 0, sumOdd = 0, sumEven = 0;
	// compute the sums
	for ( int index=0; index < data.length; index++){
		if (data[index]%2 ==0) {
			sumAll += data[index];
			sumEven += data[index];
			
		}
		else {
			sumAll += data[index];
			sumOdd += data[index];
			
		}
	}
	// write out the three sums
	System.out.println("All: " + sumAll + " Even: " + sumEven + " Odd: " + sumOdd);
	}
}