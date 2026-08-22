class Codex{
	public static void main(String[] args){
		String s="programming";
			StringBuffer sb = new StringBuffer();
			int freq[]=new int[128];	
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				freq[ch]++;	
			}
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				if(freq[ch]==1){
					sb.append(ch);				}
			}
				System.out.println(sb.toString());
		}
}