class Codex{
	public static void main(String[] args){
		String s="xyz012ab34y5";
		int count=0;
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				if(ch>='0' && ch<'9'){
					count++;
				}	
			}
		System.out.println(count);
	}
}