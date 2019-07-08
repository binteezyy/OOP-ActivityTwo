package activity102;

import java.io.*;

public class PanganibanACM_Act102Exer07 {
	public static void main ( String[] args ) throws IOException{
	int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
	// declare and initialize variables for the two largest
	int largest = 0, secondLargest = 0, temp = 0;
	// compute the two largest
	largest = data[0];
	if (data[0] < data[1]) {
		largest = data[1];
		secondLargest = data[0];
	}
	else {
		secondLargest = data[1];
	}
	for (int index= 2; index < data.length; index++){
		if (data[index] > largest) {
			temp = largest;
			largest = data[index];
			if (temp > secondLargest) {
				secondLargest = temp;
			}
		}
		else if (data[index] > secondLargest) {
			temp = secondLargest;
			secondLargest = data[index];
		}
	}
	// write out the two largest
	System.out.println("Largest: " + largest + " Second Largest: " + secondLargest);
	}
}
