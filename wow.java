import java.util.*;
import java.lang.*;
import java.util.Scanner;


class wow
{
    static int number;
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        try{
            
            number = console.nextInt();}
        catch(InputMismatchException exception){
            System.exit(0);
        
        }
        {
            
            System.out.print("W");
            for(int i=1; i<=number; i++)
            {System.out.print("o");}
            System.out.print("w");
            
            
            console.close();
            System.exit(0);
        }
    }
}

   
    

