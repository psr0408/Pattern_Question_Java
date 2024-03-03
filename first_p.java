package Pattern_questions;

public class first_p {
    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern3(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern3_1(int n) {
        // Reverse star patern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void pattern6(int n) {
        // Reverse star patern
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space print
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space print
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        int a = Math.floorDiv(n, 2);
        for (int i = 0; i < n; i++) {
            // space print
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star print
            // for(int j = n; j>i; j--){
            // System.out.print( " * ");
            // }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // space print
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i;
            if (i > n)
                star = 2 * n - i;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern10_1(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern10_2(int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {

                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println(" ");
        }

    }

    static void pattern12(int n) {
        int a = 2*(n-1);
        for (int i = 1; i <=n; i++) {
            // numbers
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
             for(int j = 0; j<a;j++){
                System.out.print(" ");
             }

            // numbers

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
            a = a - 2;
        }
    }
  static void pattern13(int n){
    int num = 1;
    for(int i = 0;i<n; i++){
        for(int j = 0; j<=i; j++){
            System.out.print(num+" ");
            num += 1;
        }
        System.out.println(" ");
    }
  }
  static void pattern14(int n){
   
    for(int i = 0; i<n;i++){
        for(char ans = 'A'; ans < 'A'+ i; ans++ ){
            System.out.print(ans+" ");
        }
        System.out.println(" ");
        
    }
  }
  static void pattern15(int n){
   
    for(int i = n; i>0;i--){
        for(char ans = 'A'; ans <'A'+ i; ans++ ){
            System.out.print(ans+" ");
        }
        System.out.println(" ");
        
    }
  }
  static void pattern16(int n){
      for(int i = 0; i < n; i++){
        //   char ans = (char) ('A' + i);
        char ans = 'A';
        ans =  (char) ((char) ans + i);
        for(int j = 0; j<=i; j++){
            System.out.print(ans+" ");
          
            
        }
   
        System.out.println(" ");
    }
  }
  static void pattern17(int n){
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        char ans = 'A';
        // int breakPoint = (2*i+1) / 2;
        int breakPoint = i;
        for(int j = 1;j <=2*i + 1; j++){
            System.out.print(ans);
            if(j<= breakPoint) ans++;
            else ans--;
        }
        for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
  }
  static void pattern18(int n){
   
    for(int i=0; i<n; i++){
       for(char ch = (char) ('E' -i); ch<='E'; ch++) {
        
        System.out.print(ch);
    }
    System.out.println(" ");
    }
  }
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

  }
  static void pattern19_1(int n){
    int space = 8;
  for(int i = 0; i<n;i++){
    for(int j =1 ; j<=i;j++){
        System.out.print("*");
    }
    for(int j =0 ; j<space;j++ ){
        System.out.print(" ");
    }
    for(int j = 1 ; j<=i;j++ ){
        System.out.print("*");
    }
    
   space -= 2;
    System.out.println(" ");
  }

  }
  static void pattern20(int n){
    int sp = 2*n-2;
    for(int i = 1; i<=2*n-1;i++){
        int star = i;
        if(i>n) star = 2*n-i;
     for(int j = 1; j<star; j++){
        System.out.print("*");
     }
     for(int j = 0; j<sp; j++){
        System.out.print(" ");
     }
     for(int j = 1; j<star; j++){
        System.out.print("*");
     }
     System.out.println(" ");
     if(i<n) sp = sp - 2;
     else sp = sp +2;
    }
  }
static void pattern21(int n){
    // System.out.print(n);
    for(int i = 0; i<n;i++){
        for(int j = 0; j<n;j++){
            if( i==0 || j==0 || i==n-1 || j==n-1 ){
                System.out.print(j);
            }
            System.out.print(" ");
        }
        System.out.println(" ");
    }
  }
    public static void main(String[] args) {
        // Problem 9 please run both pattern7 or pattern8
        int n = 5;
        pattern21(n);

    }
}