package codetesting;

class CodeTesting {
   public static void main(String[] args) {
       int x = 18;
       int y = 7;
       boolean a, b;
       a = false;
       if (x/2 < y+3)
           a = true;
       b=true;
       if ((x=y) || (y<x))
       {
           System.out.println("Broken");
       }
   }
}