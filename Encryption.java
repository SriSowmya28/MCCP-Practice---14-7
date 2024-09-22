// Encryption  of String according to given technique
// Given a string S, the task is to encrypt the string 
// Encryption Technique: If L is the length of the string, then take two values, one the ceil of ?L (say b), and the other floor of ?L (say a), and make a two-dimensional matrix having rows = a, and columns = b. 
// If rows*columns < L, then increase the value of a or b, whichever is minimum. Fill the matrix with the characters of the original string sequentially. After obtaining the matrix, read the matrix column-wise and print the obtained string.
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int x=(int)Math.sqrt(l);
        int A=(int)Math.ceil(x);
        int B=(int)Math.floor(x);
        char a[][]=new char[A][B];
        char t[][]=new char[B][A];
        int c=0;
        for(int i=0;i<B;i++){
            for(int j=0;j<A;j++){
                if(c<l){
                    a[j][i]=s.charAt(c);
                    c++;
                }else{
                    a[j][i]=' ';
                }
            }
        }
        String k="";
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                    k+=a[i][j];
            }
        }
       System.out.println(k);
    }
}
