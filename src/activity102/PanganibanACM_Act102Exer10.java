package activity102;
import java.io.*;
import java.util.*;

public class PanganibanACM_Act102Exer10 {
	public static void main(String[] args) throws IOException{
//		File file = new File("CoffeeData.txt").getAbsoluteFile();
		File file = new File(args[1]).getAbsoluteFile();
		Scanner scan = new Scanner(file);
		
		int length = scan.nextInt();
		double[] data = new double[length];
		
		
		double sum = 0.0, average = 0.0;
		for (int i = 0; i < length; i++) {
			data[i] = scan.nextDouble();
			sum+= data[i];
			System.out.println("data[" + i + "] = " + data[i]);
		}
		
		average = sum/length;
		System.out.println("average: " + average);
		
		double temp = 0.0;
		int value = 0;
		temp = Math.abs(average-data[0]);
		for (int i = 1; i < length; i++) {
			if (Math.abs(average-data[i])>temp) {
				temp = Math.abs(average-data[i]);
				value = i;
			}
		}
		System.out.println("most distant value: " + data[value]);
		double newAverage = (sum-data[value])/length;
		System.out.print("new average: " + newAverage);
		scan.close();
	}
	
}
