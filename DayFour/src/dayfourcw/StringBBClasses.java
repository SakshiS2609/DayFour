package dayfourcw;

public class StringBBClasses {
	public static void main(String args[])
	{
		String x="abc";
		x=x.concat("def");
		System.out.println("x="+x);
		
		StringBuffer sb=new StringBuffer("fgh");
		sb.append("ijk");
		System.out.println("sb="+sb);
		//string buffer and string builder are almost same except ...it is not thread safe and runs faster than string buffer
		sb.insert(2, "hello");
		System.out.println(sb);
		
		sb.replace(8, 11, "hi");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuffer sbb=new StringBuffer();
		System.out.println(sbb.capacity());
		sbb.append("heyyy!! are u hungry??");
		System.out.println(sbb.capacity());
		
		}

}
