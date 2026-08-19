class Codex{
	public static void main(String[] args){
		String s="abc";
		String s1="";
		int count=0;
			for(int i=0;i<=s.length()-1;i++){
				char ch=s.charAt(i);
				s1 = s1+ch+ch;
						
			}
		System.out.println(s1);
	}
}