class codex{
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5};
		boolean assending = true;
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]>arr[i+1]){
					assending = false;
					break ;
				}	
			}
		if(assending){
			System.out.println("arry is assending");	
		}else{
			System.out.println("arry is not assending");
		}
				
			
	}
}