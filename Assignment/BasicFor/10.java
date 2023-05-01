//WAP to print the product of first 10 Numbers

import java.io.*;
class productOfFirst10No{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int mult=1;
		for(int i=1; i<=10; i++){
			mult=mult*i;
		}
		System.out.println(mult);
	}
}
