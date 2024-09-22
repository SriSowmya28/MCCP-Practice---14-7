// Sort the numbers according to their sum of digits
// Given an array arr[] of N non-negative integers, the task is to sort these integers according to sum of their digits.
// Examples: 
 

// Input: arr[] = {12, 10, 102, 31, 15} 
// Output: 10 12 102 31 15 
// 10 => 1 + 0 = 1 
// 12 => 1 + 2 = 3 
// 102 => 1 + 0 + 2 = 3 
// 31 => 3 + 1= 4 
// 15 => 1 + 5 = 6
// Input: arr[] = {14, 1101, 10, 35, 0} 
// Output: 0 10 1101 14 35

import java.util.*;
public class MyClass {
    static int sum(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int m=sum(s[i]);
            h.put(s[i],m);
            a.add(m);
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            for(Integer k:h.keySet()){
                if(h.get(k)==a.get(i)){
                    System.out.print(k+" ");
                    h.remove(k);
                    break;
                }
               
            }
        }
    }
}
