import java.util.*;
class Codex{
	public static void main(String[] args){
	int arr[]={1,2,3,4,5,6,7,8,9};
	int size=0;
	int count=0;
		int mid =(arr.length)/2;
		
		for(int i=0; i<mid; i++){
			size++;
		}
			int arr1[]=new int [size];
		for(int i=0; i<mid; i++){
			arr1[count]=arr[i];
				count++;
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}