class Codex{
	public static void main(String[] args){
		String s="A man, a plan, a canal: Panama";
		s = s.toUpperCase();
		int count=0;
		StringBuffer sb = new StringBuffer();
			for(int i=s.length()-1;i>0;i--){
				char ch =s.charAt(0);
				if(ch>='A' && ch<='z'){
					sb.uppend(ch);
				}	
			}
		System.out.println(s);
	}
}