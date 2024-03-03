package Pattern_questions;

public class second_p {
    static void pattern19(int n){
        int space = 0;
        for(int i = 0; i<n;i++){
        for(int j =1 ; j<=n-i;j++){
            System.out.print("*");
        }
        for(int j =0 ; j<space;j++ ){
            System.out.print(" ");
        }
        for(int j = 1 ; j<=n-i;j++ ){
            System.out.print("*");
        }
        
       space += 2;
        System.out.println(" ");
      }
    
      
      int space1 = 8;
      for(int i = 0; i<n;i++){
        for(int j =0 ; j<=i;j++){
            System.out.print("*");
        }
        for(int j =0 ; j<space1;j++ ){
            System.out.print(" ");
        }
        for(int j = 0 ; j<=i;j++ ){
            System.out.print("*");
        }
        
       space1 -= 2;
        System.out.println(" ");
      }
    
      }
    public static void main(String[] args) {
        int n = 5;
        // pattern19(n);
       
    }
}
