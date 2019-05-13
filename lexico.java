import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char charArr[] = str.toCharArray();
       Arrays.sort(charArr);
       for(int i=0;i<charArr.length;i++){
           System.out.print(charArr[i]);
       }
    }
}
