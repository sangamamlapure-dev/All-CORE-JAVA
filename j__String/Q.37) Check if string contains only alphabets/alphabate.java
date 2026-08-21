class Codex{
	public static void main(String[] args){
		String s="JavaDSA";
		int count =0;
			for(int i=0;i<=s.length()-1;i++){		
			  char ch =s.charAt(i);
				if(ch>='A' && ch<='z'){
					count++;
				}
			}
		if(count==s.length()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}