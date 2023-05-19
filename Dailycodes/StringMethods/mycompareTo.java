import java.io.*;
class mycompareToDemo{
	static int mycompare(String str1,String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int x=0;
		int temp=arr1.length;
		if(arr1.length>arr2.length){
			temp=arr2.length;
		}

		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){
					x=arr1[i]-arr2[i];
					break;
				}
			}
		}else{
			for(int i=0; i<temp; i++){
				if(arr1[i]!=arr2[i]){
					x=arr1[i]-arr2[i];
					break;
				}
			}
			if(x==0){
				x=arr1.length-arr2.length;
			}
		}
		return x;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();

		System.out.println(mycompare(str1,str2));
	}
}
