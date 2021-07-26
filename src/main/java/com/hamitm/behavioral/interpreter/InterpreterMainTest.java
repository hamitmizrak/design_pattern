package com.hamitm.behavioral.interpreter;

//Java:15
//Android:13
//Pyhton:11
// JJPA=15+15+11+13=54TL
public class InterpreterMainTest {
	
	public static void main(String[] args) {
		
	Diller diller=new Diller();
	diller.simge="JJAP";
	
	Interpreter interpreter=new Interpreter();
	interpreter.genel(diller);
	System.out.println(diller.simge+" "+ diller.toplamPara);
		
	}
	
}
