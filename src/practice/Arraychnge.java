package practice;

public class Arraychnge {

	
	public static void String(String[] args) {
		
		int array[]= {3,5,7,9,11};
		change (array);
		for(int V:array)
		System.out.println(V);
	}
		//String myarray[][] = {{"akli", "ayan","elyan" },{"1","2"}};
		//System.out.println(myarray.length);
	public static void change (int X[]) {
		for (int counte=0; counte<X.length; counte++)
		X[counte]+=5;
	
	}	
	

}
