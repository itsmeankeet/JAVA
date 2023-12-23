// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class MultiplicationTable {
   int a;
   int result = 0;

   public MultiplicationTable(int var1) {
      this.a = var1;
   }

   public void table() {
      for(int var1 = 0; var1 <= 10; ++var1) {
         this.result = var1 * this.a;
         System.out.println(this.a + " * " + var1 + " = " + this.result);
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number");
      int var2 = var1.nextInt();
      MultiplicationTable var3 = new MultiplicationTable(var2);
      var3.table();
   }
}
