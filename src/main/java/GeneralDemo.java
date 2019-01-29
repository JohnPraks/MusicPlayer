package com.rythmos.demo;

public interface GeneralDemo {
	void general();
	public default void general2(){
		System.out.println("default");
		
	}

	public static void main(String args[]){
		System.out.println("------inside the main method-----");
		class Praks {
			void init(){
				System.out.println("this is the real program");
			}
		}
		Praks p = new Praks();
		p.init();
	}
}