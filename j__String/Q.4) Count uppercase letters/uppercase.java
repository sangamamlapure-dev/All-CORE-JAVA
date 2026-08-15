class Codex{
	public static void main(String[] args){
		String s="SaNGaM";
		int count=0;
			for(int i=0;i<=s.length()-1;i++){
				if(Character.isUpperCase(s.charAt(i))){
					count++;
				}
			}
		System.out.println(count);
	}
}