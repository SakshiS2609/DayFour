package dayfourcw;

public class StringOperations {

	public static void main(String args[]) {
		String str="   Core   ";
		String s="Core";
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		//no other object is created as there already exist core object in the strng pool
		//s="hi";
	//	System.out.println(s.hashCode());
		String s1=s.replace('o', 'e');// string is immutable it wont change the existing object. hence new object is created and the vaklue is assigned to it
		System.out.println(s);
		System.out.println(s1);
				System.out.println(s1.hashCode());
				
		System.out.println("Length of String s1 is:"+s1.length());
		System.out.println("index of char e"+s1.indexOf('e'));
		System.out.println("substring "+s1.substring(1));
		System.out.println("substring from s1:"+s1.substring(1, 3));
		System.out.println("remove space from str:"+str.trim()); //leading as weel as trailing white spaces are removed
		System.out.println(str.strip());
		System.out.println(str.stripTrailing());
		System.out.println(str.stripLeading());
		String strno="12345";
		String ss=String.valueOf(strno);
		System.out.println(ss instanceof String);
		/*String nullStr=null;
		System.out.println(nullStr.isEmpty()); ///generate nullpointer exception*/
		String nullStr="";
		System.out.println(nullStr.isEmpty());
		String hello="hello";
		 hello = hello.concat("everyone"); //used to concatenate a string to the existing string
		System.out.println(hello);
		System.out.println(hello.hashCode());
		checkString(nullStr);
		
		
String str1="  He yy ";
System.out.println(str1.indexOf('y'));
System.out.println(str1.length());
str1=str1.replaceAll("\\s", "");  //to remove all the spaces
System.out.println(str1.length());


System.out.println(str1.toLowerCase());

System.out.println(str1.toUpperCase());


String fruit=" Mango";

String paragraph="hello evveryone!!!.Today is wonderful sunny day. How are you all?";
System.out.println(paragraph.split("[.]"));  /// split paragraph into single single lines
String[] splittedPara= paragraph.split("[.]");
for(String sentence : splittedPara)
{
	System.out.println(sentence);
}

/*for(String sentence:paragraph.split("[.]"));

System.out.println(sentence);*/
		
	}
	private static void checkString(String nullStr) {
		// TODO Auto-generated method stb
		if(nullStr.equals(""))
		{
			System.out.println("true");
		}
	}


	}
