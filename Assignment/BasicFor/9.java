//WAP to print the sum of first 10 Numbers

import java.io.*;
class sumOfFirst10No{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		for(int i=1; i<=10; i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
