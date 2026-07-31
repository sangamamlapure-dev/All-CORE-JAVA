class demo {
	public static void main(String [] args){
		int a = 20 ;
		int b = 30 ;
		boolean c = ++a > b++ || a++ < ++b ;
		System.out.println(a);	
		System.out.println(b);
		System.out.println(c);
	}
}
