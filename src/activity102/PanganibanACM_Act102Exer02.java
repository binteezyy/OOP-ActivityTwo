package activity102;

public class PanganibanACM_Act102Exer02 {
	public static void main ( String[] args )
	{
	int[] val = {13, -4, 82, 17};
	int[] twice;
	System.out.println( "Original Array: "
	+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	
	twice = new int[val.length];
	int i=0;
	while(i<val.length) {
		twice[i] = val[i]*2;
		i++;
	}
	
	System.out.println( "New Array: "
	+ twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
	}
}
