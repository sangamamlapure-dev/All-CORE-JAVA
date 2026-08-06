import java.util.*;
class Codex{
	public static void main(String[] args){
		int arr[] ={1,2,3,4,5,6,7,8};
		int size = 0;
		int count = 0 ;
			for(int i=0; i<=arr.length-1 ; i++){
				if(i%2!=0){
					size++;
				}
			}
		int ar[]= new int [size];
			for(int i=0; i<arr.length ; i++){
				if(i%2!=0){
					ar[count]=arr[i];
					count++;
				}
	
			}
		System.out.println(Arrays.toString(ar));
	}
}