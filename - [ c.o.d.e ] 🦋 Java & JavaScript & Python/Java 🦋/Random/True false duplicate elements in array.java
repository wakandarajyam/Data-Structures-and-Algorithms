import java.util.*;
/*
4
1 2 3 1

true , false 
if duplicate true otherwise false;

*/
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        // skip 1st elements then check second duplicate elements
        
        for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
            // if(i==j){
            //   continue;
            // }
            if(arr[i]==arr[j]){
          // System.out.print(true);
          ans = 1;
          
            }
            
          }
        }
        
        if(ans == 1){
          System.out.print(true);
        }else{
          System.out.print(false);
        }

    }
}