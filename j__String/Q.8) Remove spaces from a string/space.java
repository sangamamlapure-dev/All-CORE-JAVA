class Codex{
	public static void main(String[] args){
		String s="Java DSA Course";
		String s1="";
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				if(ch !=' '){
					s1=s1+ch;
				}	
			}
		System.out.println(s1);
	}
}