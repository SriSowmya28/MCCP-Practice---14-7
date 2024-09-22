// Sort an array according to the increasing count of distinct Prime Factors
// Given an array of integers. The task is to sort the given array on the basis of increasing count of distinct prime factors.

// Examples: 

// Input : arr[] = {30, 2, 1024, 210, 3, 6}
// Output : 2 1024 3 6 30 210 

// Input : arr[] = {12, 16, 27, 6}
// Output : 16 27 6 12

import java.util.*;
public class MyClass {
    static int factors(int n){
        int i=2,t=n;
        HashSet<Integer> h=new HashSet<>();
        while(i<=t){
            if(n%i==0){
                h.add(i);
                n=n/i;
            }else{
                i++;
            }
        }
        return h.size();
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
            int m=factors(s[i]);
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
