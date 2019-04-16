package practice;

public class multiArray {

	public static void main(String[] args) {
		int ArrayM [] []= {{7,8,9,10,11,},{12,13,14,15}};
		System.out.println(ArrayM [0][3]);
		System.out.println(ArrayM [1][2]);
		// multyarray
		int myarray [][]= {{1,2,3,4},{5,6},{8,9,10,11}};
		System.out.println(myarray[2][1]);
		
		
		
		for (int[] S:ArrayM) {System.out.println(S);}
	}

}
