package practice;

import java.util.*;


public class Sntagift {
public static void main(String[] args) {
	
	Random roll = new Random() ;
	
	Scanner t = new Scanner(System.in);
	
	ArrayList <String>familymembers=new ArrayList<String>();
	
	
	
	System.out.println("type your family member name, put 10 persons name");
	String name =t.nextLine();
	familymembers.add(name);
	while (familymembers.size()!=10) {
		name=t.nextLine();
		familymembers.add(name);
		
	}
	System.out.println("your family'r memberare= "+familymembers);
	System.out.println("For who you want to check secret gift :");
	
	String nameremove=t.nextLine();
	
	familymembers.remove(nameremove);
	
	int winner =  roll.nextInt(familymembers.size());
	String wname=familymembers.get(winner);
	System.out.println(nameremove+",your gift will be given by "+wname);
	
	
	
	
	
	
	
	
	
	
	
}
}
