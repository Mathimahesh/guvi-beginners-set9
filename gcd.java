import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        if(n>m) max = n;
        else if(m>n) max = m;
        for(int i=max;i>0;i--){
            if(m%i==0 && n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
