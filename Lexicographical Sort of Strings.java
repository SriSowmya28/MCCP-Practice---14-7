// Check if words are sorted according to new order of alphabets
// Given a sequence of Words and the Order of the alphabet. The order of the alphabet is some permutation of lowercase letters. The task is to check whether the given words are sorted lexicographically according to order of alphabet. Return “True” if it is, otherwise “False”.

// Examples:

// Input : Words = [“hello”, “leetcode”], Order = “habcldefgijkmnopqrstuvwxyz”
// Output : true

// Input : Words = [“word”, “world”, “row”], Order = “abcworldefghijkmnpqstuvxyz” 
// Output : false
// Explanation : As ‘d’ comes after ‘l’ in Order, thus words[0] > words[1], hence the sequence is unsorted.

import java.util.*;
class SortByString implements Comparator<String>{
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(sc.nextLine());
        }
        String t=sc.nextLine();
        ArrayList<String> k=new ArrayList<>(a);
        Collections.sort(a,new SortByString());
        if(a.equals(t))
        System.out.println(true);
        else
        System.out.println(false);
    }
}
