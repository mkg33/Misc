import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;


class modified
{
   
    static int number;
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        try{
            
            number = console.nextInt();}
        catch(InputMismatchException exception){
            System.exit(0);
        }
        while(number!=42){
            
            System.out.println(number);
            
            
            try{
                number = console.nextInt();
            }
            catch(InputMismatchException exception){
                System.exit(0);
            }
            
            
            
        }
        {
            if(number==42){
                System.out.println(number);
            }
            
            console.close();
            System.exit(0);
            
        }
    }
}
