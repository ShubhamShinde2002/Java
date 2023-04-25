//4]WAP take character as input from user and print only vowels from it

import java.io.*;
class Vowel{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array:");
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];
		System.out.println("Enter the characters:");
		for(int i=0; i<arr.length; i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[i]);
		}
		}

	}
}
