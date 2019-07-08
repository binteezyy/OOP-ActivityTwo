package activity102;

public class PanganibanACM_Act102Exer03 {
	public static void main ( String[] args ){
	int[] valA = { 13, -22, 82, 17};
	int[] valB = {-12, 24, -79, -13};
	int[] sum = { 0, 0, 0, 0};
	// Add values from corresponding slots of valA and valB
	// and put the result in the corresponding slot of sum.
	int i = 0;
	while (i<valA.length){
		sum[i] = valA[i] + valB[i];
		i++;
	}
	System.out.println( "sum: "
	+ sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	}
}
