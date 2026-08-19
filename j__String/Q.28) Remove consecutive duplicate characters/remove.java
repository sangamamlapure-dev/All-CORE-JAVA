class Codex{
	public static void main(String[] args){
		String s="aabbcddffgggghhi";
		int freq[] = new int[127];
			for(int i=0;i<=s.length()-1;i++){
			char ch =s.charAt(i);
				freq[ch]++;				
			}
			for(int i=0; i<=freq.length-1;i++){
				if(freq[i]>0){
				System.out.print((char)i);
				}	
			}
	}
}