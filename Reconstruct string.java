// Reconstruct original string from resultant string based on given encoding technique
// A binary string S of length N is constructed from a string P of N characters and an integer X. The choice of the ith character of S is as follows:

// If the character Pi-Xexists and is equal to 1, then Si is 1
// if the character Pi+X exists and is equal to 1, then Si is 1
// if both of the aforementioned conditions are false, then Si is 0.
// Given the resulting string S and the integer X, reconstruct the original string P. If no string P can produce the string S, output -1.
// Examples:

// Input: S = “10011”, X = 2
// Output: “01100”
// Explanation: The input string S = “10011” can be constructed from the output string P = “01100”.

// Input: S = “11101100111”, X = 3
// Output: -1
// Explanation: The input string S = “11101100111” cannot be constructed from any output string P.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int x=sc.nextInt();
        String k="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='0'){
                k+='1';
            }else{
                k+='0';
            }
        }
        String p="";
        for(int i=0;i<n;i++){
            if(i-x>=0 && s.charAt(i-x)=='1'){
                p+='1';
            }
            else if(i+x<n && s.charAt(i+x)=='1'){
                p+='1';
            }else{
                p+='0';
            }
        }
        if(k.equals(p))
            System.out.println(k);
        else
            System.out.println("-1");
    }
}
