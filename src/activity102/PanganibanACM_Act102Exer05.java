package activity102;

public class PanganibanACM_Act102Exer05 {
	public static void main ( String[] args )
	{
	int[] val = {0, 1, 2, 3};
	int temp;
	System.out.println( "Original Array: "
	+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	
	int i = 0, last = 0;
	while(i<val.length-(val.length/2)) {
		temp = val[i];
		last = val.length - (i+1);
		val[i] = val[last];
		val[last] = temp;
		i++;
	}
	
	System.out.println( "Reversed Array: "
	+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	}
}
