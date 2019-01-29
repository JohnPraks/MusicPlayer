package com.rythmos.demo;


public class LambdaDemo {
	public static void main(String args[]){
		GeneralDemo generalDemo = new GeneralDemo(){
			public void general(){
				System.out.println("==================");
			}
		};
		generalDemo.general();
	
	}

}