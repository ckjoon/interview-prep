public class BasicRecursion{
	public static void main(String[] args){
		System.out.println("Fib : "+fib(0));
		System.out.println("Fib : "+fib(1));
		System.out.println("Fib : "+fib(2));
		System.out.println("Sum of digits 123 : "+sumOfDigits(123)); 
	}
	
	public static int fib(int n){
		if(n<0){
			return 0;
		}
		if(n==0){	
			return 1;	
		}
		if(n==1){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static int sumOfDigits(int n){
		if(n<0){
			n=-1*n;
		}	
		if(n<10){
			return n;
		}
		return n%10+sumOfDigits(n/10);
	}
	
}
