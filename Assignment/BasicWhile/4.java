// WAP to print the count of odd digit in no

class oddDigitInNO{
	public static void main(String[] args){
		int x=46534562;
		int count=0;
		int y;
		while(x!=0){
			y=x/10;
			if(y%2==1){
				count++;
			}
			x=x/10;
		}
		System.out.println(count);
	}
}
