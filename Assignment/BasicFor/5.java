//WAP to print the Odd number from 1 to 50

import java.io.*;
class oddNO{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i<=50; i++){
			if(i%2==1)
				System.out.println(i);
		}
	}
}
