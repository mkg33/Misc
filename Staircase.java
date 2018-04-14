import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  
    static void staircase(int n) {
      
        
     
        
        
        
        for(int i=1; i<=n; i++){
            
            String connected = new String(new char[n-i]).replace("\0", " ");
            
            String connected2 = new String(new char[i]).replace("\0", "#");
            
            System.out.println(connected+connected2);
            
            connected = "";
            
            connected2 = "";
            
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}

