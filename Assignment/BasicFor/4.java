//WAP to print the Even number from 1 to 100

import java.io.*;
class evenNO{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i<=100; i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
}
