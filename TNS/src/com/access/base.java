package com.access;

public class base {
	
	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d = 40;
	
	private void Method1() {
		System.out.println("This is a Private Method1");
		System.out.println(a);
	}
	
	public void Method2() {
		System.out.println("This is a Public Method2");
		System.out.println(b);
	}
	
	protected void Method3() {
		System.out.println("This is a Protected Method3");
		System.out.println(c);
	}
	
	public static void main(String []args) {
		base b = new base();
		b.Method1();
		b.Method2();
		b.Method3();
	}

}
