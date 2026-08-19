class Codex{
	public static void main(String[] args){
		String s="Java DSA Course";
		String arr[]=s.split(" ");
			for(int i=0;i<arr.length;i++){
				String word=arr[i];
				for(int j=word.length()-1;j>=0;j--){
					System.out.print(word.charAt(j));	
				}
					System.out.print(" ");
			}
	}
}