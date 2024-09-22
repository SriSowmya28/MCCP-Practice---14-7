// concatenating uncommon characters of given strings
// Given two strings S1 and S2. The task is to concatenate uncommon characters of the S2 to S1  and return the resultant string S1 .

// Examples: 

// Input: S1 = “aacdb”, S2 = “gafd”
// Output: “cbgf”

// Input: S1 = “abcs”, S2 = “cxzca”;
// Output: “bsxz”

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        ArrayList<Character> h1=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            h1.add(s1.charAt(i));
        }
        ArrayList<Character> h2=new ArrayList<>();
        for(int i=0;i<s2.length();i++){
            h2.add(s2.charAt(i));
        }
        String k="";
        for(int i=0;i<s1.length();i++){
            if(!h2.contains(s1.charAt(i))){
                k+=s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(!h1.contains(s2.charAt(i))){
                k+=s2.charAt(i);
            }
        }
        System.out.print(k);
    }
}
