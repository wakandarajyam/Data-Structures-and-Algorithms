import java.util.*;
// input 123
// output 6
public class Main {
    public static void main(String[] args) {
    int n = 123;
    int ans = output(n);
    System.out.print(ans);
  }
  private static int output(int n){
    if(n<10){
      return n;
    }
     int sum =0; // 6
       while(n>0){
          int rem = n%10;
        sum = sum+ rem;
        n = n/10;
        
       }
   return output(sum);
  }
}