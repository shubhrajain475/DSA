//last occurence of an element in an array
public class Recursion4{
	public static int lastOccurence(int arr[],int key,int i){
		if(i==arr.length){
			return -1;
			
		}
		int isfound=lastOccurence(arr,key,i+1);
		if(isfound==-1&&arr[i]==key){
			return i;
		}
		return isfound;
	}
	public static void main(String ar[]){
		int arr[]={8,3,6,9,5,10,2,5,3};
		System.out.println(lastOccurence(arr,5,0));
	}
}