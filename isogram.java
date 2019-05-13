import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       int count = 0;
       char charArr[] = str.toCharArray();
       Arrays.sort(charArr);
       for(int i=0;i<str.length()-1;i++){
          if(charArr[i]==charArr[i+1]){
            count++;  
          } 
       }
        if(count==0) System.out.println("yes");
           else System.out.println("no");
    }
}
