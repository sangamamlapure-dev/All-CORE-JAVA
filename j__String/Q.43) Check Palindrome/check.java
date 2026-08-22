class Codex{
	public static void main(String[] args){
		String s="aba";
		String s1="";
		int count=0;
			for(int i=s.length()-1;i>=0;i--){
				char ch =s.charAt(i);
				s1=s1+ch;
			}	
			if(s.equals(s1)){
				System.out.println("true");
			}
	}
}