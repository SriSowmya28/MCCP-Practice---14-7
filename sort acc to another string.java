// Sort a string according to the order defined by another string
// Given two strings (of lowercase letters), a pattern, and a string. The task is to sort strings according to the order defined by the pattern. It may be assumed that the pattern has all characters of the string and all characters in the pattern appear only once.

// Examples: 

// Input  : pat = "bca", str = "abc"
// Output : str = "bca"

// Input  : pat = "bxyzca", str = "abcabcabc"
// Output : str = "bbbcccaaa"

// Input  : pat = "wcyuogmlrdfphitxjakqvzbnes", str = "jcdokai"
// Output : str = "codijak"

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String pat=sc.nextLine();
        String str=sc.nextLine();
        String k="";
        HashMap<Character,Integer> s=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(s.containsKey(c)){
                s.put(c,s.get(c)+1);
            }else{
                s.put(c,1);
            }
        }
        for(int i=0;i<pat.length();i++){
            char c=pat.charAt(i);
            if(s.containsKey(c)){
                for(int j=0;j<s.get(c);j++){
                    k+=c;
                }
            }
        }
       System.out.println(k);
    }
}
