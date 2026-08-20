class Codex{
	public static void main(String[] args){
		String s="apple";
		int freq[]=new int[122];
			for(i=0;i<=s.length()-1;i++){
				freq[s.charAt(i)]++;	
			}
			for(int i=0;i<=freq.length-1;i++){
				if(freq[i]>0){
					System.out.println((char)i +"="+ freq[i]);
				}
			}
	}
}