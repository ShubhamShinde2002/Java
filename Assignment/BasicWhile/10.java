// WAP to check no is palindrome or not
import java.io.*;
class palindromeNO{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		int store;
		int y=0;
		int z=x;
		while(x!=0){
			store=x%10;
			y=(y*10)+store;
			x=x/10;

		}
		if(z==y){
			System.out.println(z+" "+"is a palindrome Number");
		}else
			System.out.println(z+" "+"is a not palindrome Number");
		}
		
	}

