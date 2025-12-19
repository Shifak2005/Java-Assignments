package Assignment1;
import java.util.*;

	public class Calculator {

	   public static int add(int a, int b) 
	    { 
		   return a + b;
		   }
	   public static int sub(int a, int b) 
	    { 
		   return a - b; 
		   }
	   public static int mul(int a, int b)
	    { 
		   return a * b; 
		   }
	   public static int div(int a, int b)
	    { 
		   return a / b; 
		   }
	   public static int rem(int a, int b)
	    { 
		   return a % b;
		   }
	   public static int square(int a)
	    {
		   return a * a; 
		   }
	   public static int cube(int a)
	    {
		   return a * a * a; 
		   }
	   public static int absolute(int a)
	    { 
		   return Math.abs(a); 
		   }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter first number");
	        int a = sc.nextInt();
	        System.out.println("Enter second number");
	        int b = sc.nextInt();

	        System.out.println(add(a,b));
	        System.out.println(sub(a,b));
	        System.out.println(mul(a,b));
	        System.out.println(div(a,b));
	        System.out.println(rem(a,b));
	        System.out.println(square(a));
	        System.out.println(cube(a));
	        System.out.println(absolute(a));
	    }
	

}
