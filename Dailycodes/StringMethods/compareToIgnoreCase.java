// IT COMPARES THE STR1 & STR2 (CASE INSENSITIVE) IF BOTH THE STRING ARE EQUAL IT RETURN 0 OTHERWISE RETURN THE COMPARISION
//
// PARAMETER - String(Second String)
// RETURN TYPE - Integer
//

class compareToIgnoreCaseDemo{
	public static void main(String[] args){
		String str1="ASHISH";
		String str2="ashish";

		System.out.println(str1.compareToIgnoreCase(str2));
	}
}
