import java.util.*;
class Codex{
	public static void main(String[] args){
		int arr[] ={2,3,4,5};
		int a []= new int[4];
		int count = 0;
			for(int i=arr.length-1; i>=0; i--){
				a[count] = arr[i];
					count++;
			}
				System.out.println(Arrays.toString(a));
	}
}