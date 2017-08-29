import java.util.Scanner;

public class Assignment_1 {
         public static void main(String args[]){
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter the value of a ,b , c");
        	 double a=sc.nextDouble();
        	 double b=sc.nextDouble();
        	 double c=sc.nextDouble();
        	 if(a>=b && a>=c)
        		 System.out.println(a+" is the largest number ");
        	 else if(b>=a && b>=c)
        		 System.out.println(b+" is the largest nuber");
        	 else
        		 System.out.println(c+" is the largest number");
         }
}
