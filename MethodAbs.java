import java.util.Scanner;

public class MethodAbs{
	
	static int absValue(int num){
	
		int returnValue;
		
		if(num>0)
			returnValue = num;
		else
			returnValue = -1*num;
		
		return returnValue;
	
	}

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.println( "Enter a number: " );
	int absValue1;
	int input = scan.nextInt();
	
	absValue1 = absValue(input);
	System.out.println("absolute value is " + absValue1);
	
	}

}