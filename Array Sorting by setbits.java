// Sort an array according to count of set bits | Set 2
// Given an array arr[] of positive integers, the task is to sort the array in decreasing order of count of set bits in binary representations of array elements. 
// For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort. For example, if input array is {3, 5}, then output array should also be {3, 5}. Note that both 3 and 5 have same number set bits.
// Examples: 
 

// Input: arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32} 
// Output: 15 7 5 3 9 6 2 4 32 
// The integers in their binary representation are: 
// 15 – 1111 
// 7 – 0111 
// 5 – 0101 
// 3 – 0011 
// 9 – 1001 
// 6 – 0110 
// 2 – 0010 
// 4 – 0100 
// 32 – 10000 
// Hence, the non-increasing sorted order is: 
// {15, 7, 5, 3, 9, 6, 2, 4, 32}
// Input: arr[] = {1, 2, 3, 4, 5, 6}; 
// Output: 3 5 6 1 2 4

import java.util.*;
public class MyClass {
    static int setbits(int n){
        int c=0,t=n;
        while(n>0){
            if((n&1)==1)
            c++;
            n>>=1;
        }
        System.out.println(t+" "+c);
        return c;
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
            int m=setbits(s[i]);
            h.put(s[i],m);
            a.add(m);
        }
        Collections.sort(a,Collections.reverseOrder());
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
