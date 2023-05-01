//WAP to print the first 100 Numbers

import java.io.*;
class first100No{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<100; i++){
			System.out.println(i+1);
		}
	}
}
