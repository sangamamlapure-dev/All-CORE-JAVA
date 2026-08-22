class Codex{
	public static void main(String[] args){
		String s="aabbbcddcef";
		int lowest=0;
		int freq[]=new int[128];
			for(int i=0;i<=s.length()-1;i++){
				char ch = s.charAt(i);
					freq[ch]++;
			}
			for(int i=0;i<=freq.length-1;i++){
				if(freq[i]>0 && freq[i]<freq[lowest]){
					lowest=i;
				}	
			}
		System.out.println((char)lowest);
	}
}