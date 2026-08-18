class Codex{
	public static void main(String[] args){
		String s="abc123yz45";
		String s1="";
			for(int i=0;i<=s.length()-1;i++){
				char ch = s.charAt(i);
				if(ch>=48 && ch<=57){
					s1=s1+ch;
				}	
			}
			System.out.println(s1);	
	}
}