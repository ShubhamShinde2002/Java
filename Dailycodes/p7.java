class StringDemo5{
	public static void main(String[] args){
		String str1="Shubham";
		String str2="Shinde";

		System.out.println(str1+str2);

		String str3="ShubhamShinde";
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
