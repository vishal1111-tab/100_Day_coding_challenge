package Foundation;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;
		int n1 = n;
	int count =0;
	while(n!=0){
		count++;
		n = n/10;
		
	}

	int pro = 0;
     
	while(n1!=0){
	   
	   int rem = n1 % 10;
	   pro = pro + (int) Math.pow(rem , count);
	   
		n1= n1/10;
		
	}
	if(temp==pro){
	
		 System.out.println("true");
		 
	}
	
	else {
	
		 System.out.println("false");
	}
	




}

}
