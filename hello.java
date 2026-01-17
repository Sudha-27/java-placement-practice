 import java.lang.System;
  import java.util.Scanner;
  class hello{

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       int total=0;
       int current=1;
       while(current<=n){
           total=total+current;
           current=current+1;
       }
         System.out.println(total);
     }
  }