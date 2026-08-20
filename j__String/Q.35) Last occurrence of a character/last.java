class Codex{
	public static void main(String[] args){
		String s="programming";
			for(int i=s.length()-1;i>0;i--){
			  char ch =s.charAt(i);
				if(ch=='r'){
					System.out.println(i);
					break;
				}
			}
	}
}