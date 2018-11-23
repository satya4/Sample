package com.app;

public class Test implements A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method");
	}
	public static void main(String[] args) {
		System.out.println(A.x);
		Test t = new Test();
		t.show();
		t.display();
		
	}

}
