//WAP to print the first 10 Numbers

import java.io.*;
class first10No{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++){
			System.out.println(i+1);
		}
	}
}
