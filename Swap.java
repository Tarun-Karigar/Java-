public class Swap{
	public static void main(String args[]){
		int a = 64960;
		int b = 498496;
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a is :" + a);
		System.out.println("The value of b is :" + b);
	}
}