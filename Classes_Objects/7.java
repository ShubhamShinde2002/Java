// ACCESS SPECIFIER

class Core2Web{
	int numOfCourse= 8;
	private String favCourse="CPP";

	void disp(){

		System.out.println(numOfCourse);
		System.out.println(favCourse);
	}
}
class student{
	public static void main(String[] args){
		Core2Web obj1=new Core2Web();
		obj1.disp();

		System.out.println(obj1.numOfCourse);
		System.out.println(obj1.favCourse);
	}
}
//error - favCousre has private access in Core2Web
