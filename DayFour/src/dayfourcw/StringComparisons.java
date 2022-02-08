package dayfourcw;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Hello";
  String ss="Hello";
  String s1=new String("Hello");
  System.out.println(str.equals(ss)); //compares the value to strings
  
  System.out.println(str==ss);// compares the address of the strings
  System.out.println(str==s1);// 
  System.out.println(ss==s1);
  System.out.println(str.equals(s1));
  System.out.println(ss.equals(s1));
  System.out.println(str.hashCode());

  System.out.println(s1.hashCode());
  
  System.out.println(System.identityHashCode(s1));
  System.out.println(System.identityHashCode(str));
	}

}
