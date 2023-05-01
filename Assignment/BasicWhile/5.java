// WAP to print the Square of even digit in no

class squareOfEvenDigitNo{
	public static void main(String[] args){
		int x=46534;
		int y;
		while(x!=0){
			y=x%10;
			if(y%2==0){
				System.out.println(y*y);
			}
			x=x/10;
		}
		
	}
}
