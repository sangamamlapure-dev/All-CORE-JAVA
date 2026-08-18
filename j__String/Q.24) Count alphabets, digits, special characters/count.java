class Codex{
	public static void main(String[] args){
		String s="abc123@#";
		int Alphacount=0;
		int specialcount=0;
		int digitcount=0;
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				if(ch>='A' && ch<='z'){
					Alphacount++;
				}else if(ch>='0' && ch<='9'){
					digitcount++;
				}else{
					specialcount++;
				}
			}
		System.out.println("Aiphacont"+" = "+Alphacount);
		System.out.println("specialcount"+" = "+specialcount);
		System.out.println("digitcount"+" = "+digitcount);

	}
}