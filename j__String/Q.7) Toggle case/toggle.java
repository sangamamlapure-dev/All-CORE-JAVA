class Codex{
	public static void main(String[] args){
		String s="JAva";
		String n ="";
			for(int i=0;i<=s.length()-1;i++){
			char ch = s.charAt(i);
				if(Character.isUpperCase(ch)){
					n=n+Character.toLowerCase(ch);
				}else{
					n=n+Character.toUpperCase(ch);

				}
			}

				System.out.println(n);
	}
}