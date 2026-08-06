class Codex{
	public static void main(String[] args){
		int arr[] = {10,20,30,40};
		int target = 40;
		boolean istarget = false;
			for(int i=0; i<=arr.length-1; i++){
				if(arr[i] == target){
					 istarget = true;
						break ;
				}	
			}
		if(istarget ){
			System.out.println("target found");
		}else{
			System.out.println("target is not found");
		}
	}
}
	