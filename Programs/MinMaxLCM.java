import java.util.Scanner;

class Codechef {
   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int t = sc.nextInt();
      while (t-->0) {
         int x = sc.nextInt();
         int k = sc.nextInt();
//         For min LCM
         System.out.print(2*x);
         System.out.print(" ");
//        For max LCM
         System.out.print(x*k*(x*k-1));
         System.out.println();
         
      }
   }
}








         



         


         
      


