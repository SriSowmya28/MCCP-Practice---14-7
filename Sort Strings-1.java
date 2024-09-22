// Sort an array of strings according to string lengths
// We are given an array of strings, we need to sort the array in increasing order of string lengths.
// Examples: 

// Input : {“GeeksforGeeeks”, “I”, “from”, “am”}
// Output : I am from GeeksforGeeks

// Input :  {“You”, “are”, “beautiful”, “looking”}
// Output : You are looking beautiful

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        HashMap<String,Integer> h=new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            h.put(s[i],s[i].length());
            a.add(s[i].length());
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            for(String k:h.keySet()){
                if(h.get(k)==a.get(i)){
                    System.out.print(k+" ");
                    break;
                }
               
            }
        }
    }
}
