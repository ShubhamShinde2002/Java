//WAP to print the table of 12

import java.io.*;
class tableOf12{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i<=10; i++){
				System.out.println(i*12);
		}
	}
}
