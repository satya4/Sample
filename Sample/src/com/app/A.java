package com.app;

public interface A {
	int x = 5;
	void show();
	default void display(){
		System.out.println("display method in interface");
	}
}
