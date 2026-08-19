class Codex{
	public static void main(String[] args){
		String s="programming,pro";
		String arr[]=s.split(",");
		String prefix=s.substring(0,arr[1].length());
			for(int i=0+1;i<=arr.length-1;i++){
				if(arr[i].equals(prefix)){
					System.out.println("true");
				}else{
					System.out.println("false");	
				}
			}
	}
}