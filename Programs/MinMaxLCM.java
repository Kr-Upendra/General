import java.util.Scanner;

class Codechef {
   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int t = sc.nextInt();
      while (t--) {
         int x = sc.nextInt();
         int k = sc.nextInt();
         

         System.out.print(2*x);
         System.out.println();
         
         System.out.print(x*k*(x*k-1));
         System.out.println();
         
      }
   }
}
