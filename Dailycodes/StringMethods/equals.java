// PREDICATE WHICH COMPARES AND OBJECT TO THIS.
// THIS IS TRUE ONLY FOR STRINGS WITH THE SAME CHARACTER SEQUENCE
// RETURNS TRUE IF AN OBJECT IS SEMANTICALLY EQUAL TO THIS

//PARAMETER -Object(anObject)
//RETURN TYPE - boolean

class equalsDemo{
	public static void main(String[] args){
		String str1="Shashi";
		String str2=new String("Shashi");

		System.out.println(str1.equals(str2));
	}
}
