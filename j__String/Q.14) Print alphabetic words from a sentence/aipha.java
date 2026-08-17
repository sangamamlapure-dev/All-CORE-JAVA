class Codex{
	public static void main(String[] args){
		String s="abc 123 xyz";
		int count=0;
			for(int i=0;i<=s.length()-1;i++){
				char ch=s.charAt(i);
					if(!(ch>=48 && ch<=57)){
						System.out.print(ch);			
						
					}
			}
	}
}