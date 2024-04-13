//Tiling Problem
public class Recursion7{
	public static int tilingproblem(int n){
		if(n==0||n==1){
			return 1;
		}
		int fn1=tilingproblem(n-1);
		int fn2=tilingproblem(n-2);
		int totalways=fn1+fn2;
		return totalways;
	}
	public static void main(String ar[]){
		System.out.println(tilingproblem(3));
	}
}