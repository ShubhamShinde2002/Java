//WAP to print the table of 12 in reverse

import java.io.*;
class revTableOf12{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=10; i>=1; i--){
				System.out.println(i*12);
		}
	}
}
