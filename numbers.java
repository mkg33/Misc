
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class numbers {

	static ArrayList<Integer> numbers = new ArrayList<Integer>(); 
	static int number;
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	try{
	System.out.println("Enter some numbers: ");
	number = console.nextInt();}
	catch(InputMismatchException exception){
		System.exit(1);
	}
	while(number!=42){
	
		numbers.add(number);
		try{
		number = console.nextInt();
		}
		catch(InputMismatchException exception){
			System.exit(1);
		}

		
		
	}
	{
		for(int i=0; i<numbers.size(); i++)
	System.out.println(numbers.get(i));
	
	console.close();
	System.exit(1);
	}
}
}
	


	
	
	

