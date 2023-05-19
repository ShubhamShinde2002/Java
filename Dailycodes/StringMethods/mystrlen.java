import java.io.*;
class lenDemo{
	static int mystrlen(String str){
		char arr[]=str.toCharArray();
		int count=0;
		for(int x:arr){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str1=br.readLine();
		String str2=br.readLine();

		int len1=mystrlen(str1);
		int len2=mystrlen(str2);

		if(len1==len2){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
}
