class reverseDemo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Shashi");

		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String str1="Core2Web";
		StringBuffer sb2=new StringBuffer(str1);
		str1=sb2.reverse().toString();
		System.out.println(str1);
	}
}
