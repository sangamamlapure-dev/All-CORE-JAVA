class Codex{
	public static void main(String[] args){
		String s="banana";
		int occ='a';
		int count=0;
			for(int i=0;i<=s.length()-1;i++){
				 if(s.charAt(i)==occ){
					count++;
				 }	 	 		
			}
		System.out.println(count);
	}
}