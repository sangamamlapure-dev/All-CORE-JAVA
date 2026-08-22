class Codex{
	public static void main(String[] args){
		String s="aabbbcddcef";
		int max=0;	
		int arr[]=new int[127];
			for(int i=0;i<=s.length()-1;i++){
				char ch =s.charAt(i);
				arr[ch]++;	
			}
			for(int i=0;i<=arr.length-1;i++){
				if(arr[i]>arr[max]){
					 max=i;
				}
					
			}
				System.out.println((char)max);
	}
}