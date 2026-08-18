class Codex{
	public static void main(String[] args){
		String s="bdte";
			char ch = s.charAt(0);

			for(int i=0;i<=s.length()-1;i++){
				char c = s.charAt(i);
				if(c>ch){
					ch=c;
				}
			}
		System.out.println(ch);
	}
}