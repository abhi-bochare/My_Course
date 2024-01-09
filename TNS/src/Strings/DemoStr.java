package Strings;

public class DemoStr {
	public static void main(String []args) {
		
		String st = "   Abhishek   ";               // By string Literal
		String s1 = new String("Bochare");
		char ch[] = {'a','r','r','a','y'};
		String s2 = new String(ch);                 // By New Keyword
		
		System.out.println(st);
		System.out.println(s1);
		System.out.println(s2);
		
		// Length()
		System.out.println("Length of st : " + st.length());
		int a = s1.length();
		System.out.println("Length of s1 : "+ a);
		
		//charAt()
		System.out.println(s1.charAt(3));
		
		//substring()
		System.out.println(s1.substring(1,4));
		
		//trim()
		System.out.println(st.trim());
		
		//concat()
		String s4 = new String(s2.concat(" is not a String"));
		System.out.println(s4);
		
		// ToUpperCase()
		System.out.println(s2.toUpperCase());
		
	}
}
