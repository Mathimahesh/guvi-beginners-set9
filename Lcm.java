import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = 0;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0) lcm = i;
        }
        int val = (n1*n2)/lcm;
        System.out.println(val);
      
      
    }
}
