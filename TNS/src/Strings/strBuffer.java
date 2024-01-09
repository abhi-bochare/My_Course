package Strings;

public class strBuffer {
	public static void main(String []args) {
		
		StringBuffer sb = new StringBuffer("Namastey");
		System.out.println(sb);
		
		//Apend()
		sb.append("TNS Class");
		System.out.println(sb);
		
		//insert()
		sb.insert(8, " all ");
		System.out.println(sb);
		
		//replace()
		sb.replace(9, 16, "GHRIET");
		System.out.println(sb);
		
		//delete()
		sb.delete(17, 21);
		System.out.println(sb);
		
		//reverse()
		sb.reverse();
		System.out.println(sb);
	}

}
