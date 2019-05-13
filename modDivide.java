import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       long n1 = sc.nextInt();
       long n2 = sc.nextInt();
       char ch = sc.next().charAt(0);
      switch(ch){
          case '/':
              System.out.println(n1/n2);
              break;
          case '%':
              System.out.println(n1%n2);
              break;
      }
      
    }
}
