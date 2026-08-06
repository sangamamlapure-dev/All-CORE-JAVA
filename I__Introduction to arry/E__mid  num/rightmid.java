class Codex{
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5,6,7};
		int midright = arr.length/2 ;
			for(int i= midright+1; i<=arr.length-1 ;i++){
				System.out.println(arr[i]);
			}
	}
}