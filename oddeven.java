import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String odd = "";
        String even = "";
        for(int i=0;i<str.length();i++){
            if(i%2==0) even += str.charAt(i);
            else odd += str.charAt(i);
        }
        System.out.println(odd+" "+even);
    }
}
