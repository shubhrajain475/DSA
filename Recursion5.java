//Power of x^n
public class Recursion5{
	public static int power(int x,int n){
		if(n==0){
			return 1;
		}
		return x*power(x,n-1);
	}
	public static void main(String ar[]){
		System.out.print(power(2,5));
	}
}