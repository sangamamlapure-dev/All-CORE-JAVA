class Codex{
	public static void main(String[] args){
		String s="abc,abc";
		String arr[]=s.split(",");
		for(int i=arr.length-1;i>=0;i--){
			String word=arr[i];
			if(arr[0]==arr[i]){
				System.out.println("true");
			}
		}	
	}	
}