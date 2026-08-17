class Codex{
	public static void main(String[] args){
		String s="I love coding";
		String arr[]=s.split(" ");
			String max=arr[0];
			for(int i=0;i<=arr.length-1;i++){
				if(arr[i].length() >arr[0].length()){
					max=arr[i];
				}
			}			
		System.out.println(max);
	}
}