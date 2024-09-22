// Rail Fence Cipher – Encryption 
// Given a plain-text message and a numeric key, cipher the given text using Rail Fence algorithm. 
// The rail fence cipher (also called a zigzag cipher) is a form of transposition cipher. It derives its name from the way in which it is encoded. 
// Examples: 

// Encryption
// Input :  "GeeksforGeeks "
// Key = 3
// Output : GsGsekfrek eoe

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int key=sc.nextInt();
        char a[][]=new char[key][l];
        int c1=0,c2=0,i=0,j=0,f=1;
        a[0][0]=s.charAt(0);
        while(j<l){
            a[i][j]=s.charAt(j);
            if(a[i][j]==' '){
                j++;
                continue;
            }
            if(f==1){
                c1++;
                if(c1==key){
                    f=0;
                    c2=0;
                    continue;
                }
                i++;
            }
            if(f==0){
                c2++;
                if(c2==key){
                    f=1;
                    c1=0;
                    continue;
                }
                i--;
            }
            j++;
        }
        String k="";
        for(i=0;i<key;i++){
            for(j=0;j<l;j++){
                char q=a[i][j];
                if((q>='a' && q<='z')||(q>='A' && q<='Z')){
                    k+=a[i][j];
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
       System.out.println(k);
    }
}
