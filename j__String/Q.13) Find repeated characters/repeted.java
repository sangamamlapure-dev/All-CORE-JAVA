class Codex{
	public static void main(String[] args){
		String s="programming";
		int freq[]= new int[122];
			for(int i=0;i<=s.length()-1;i++){
				freq[s.charAt(i)]++;
			}
			for(int i=0;i<=freq.length-1;i++){
				if(freq[i]>1){
					System.out.println((char)i);
	
				}
			}
	}
}