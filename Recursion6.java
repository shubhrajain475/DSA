//Power of x^n int logn
public class Recursion6{
	public static int power(int x,int n){
		if(n==0){
			return 1;
		}
		int halfsq=power(x,n/2)*power(x,n/2);
		if(n%2!=0){
			halfsq=x*halfsq;
		}
		return halfsq;
	}
	public static void main(String ar[]){
		System.out.print(power(2,5));
	}
}