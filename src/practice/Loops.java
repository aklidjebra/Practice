package practice;

public class Loops {

	public static void main(String[] args) {
		/*    if i were a billionaire i would buy a private jet, 
	      if millionaire i would buy a mercedes benz, 
	      if not i would buy a honda
	*/
		int age =4;
		String statue="millio";
		if (statue=="billio") {
			System.out.println("i would buy a jet");	
		}else if (statue=="millio"){
		System.out.println("i would buy BMW");
		}else {
		System.out.println("i would buy honda");}
		// switch statments
		System.out.println("------------");
	switch (age) {
	case 1:System.out.println("i can crawl");
	break;
	case 2:System.out.println("i can walk");
	break;
	case 3:System.out.println("i can talk");
	break;
	default :System.out.println("i can do what ever i want");
	break;
}System.out.println("------------");

int A=5; while (A<10) {
	A++;
	System.out.println(A);}
System.out.println("------------");
	for(int B=2; B<5;B++) {  
		System.out.println(B);
	}System.out.println("------------");
	int C=5;
	do { System.out.println(C); C++;}while (C<10);
			
		
	
	
	
	
	
	
	
}}