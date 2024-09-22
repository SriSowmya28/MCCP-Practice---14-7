// Find the string among given strings represented using given encryption pattern
// Given an array of strings arr[] of size N and an encrypted string str, the task is to find the correct string from the given array of strings whose encryption will give str where str is encrypted using the following rules: 

// The starting characters form an integer representing the number of uppercase symbols In the decrypted string.
// The next 3 characters are the last 3 characters of the decrypted string in reverse order.
// The last few characters also form an integer representing the sum of all digits in the password.
// The length of each string in the array is at least 3 and if there is more than one correct answer, print among them.
// Examples: 

// Input: arr[] = {“P@sswORD1”, “PASS123word”}, str = “4dro6”
// Output: PASS123word
// Explanation: The decrypted string representing str = “4dro6” should have 
// 4 upper case letters, sum of all digits in it as 6 and ends with “ord”. 
// The output string satisfies all the following properties.

// Input: arr[] = {“Geeks”, “code”, “Day&Night”}, str = “1thg10”
// Output: -1
// Explanation: No such string exists which satisfies the encryption.

import java.util.*;
public class MyClass {
    static String check(String s){
        String ans="";
        int t=0;
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                count++;
            }
            if(c>='0' && c<='9'){
                t+=(int)c-48;
            }
        }
        ans+=String.valueOf(count);
        ans+=s.charAt(n-1);
        ans+=s.charAt(n-2);
        ans+=s.charAt(n-3);
        ans+=String.valueOf(t);
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        int f=0;
        String s=sc.nextLine();
        for(int i=0;i<n;i++){
            if(s.equals(check(arr[i]))){
                System.out.println(arr[i]);
                f=1;
            }
        }
        if(f==0)
        System.out.println("-1");
    }
}
