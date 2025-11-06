package com.examples;

import com.example.classes.*;
import com.example.intf.*;

public class Application {
	public static void main(String[] args) {

		Car swift = new Swift();
		Corola corola = new Corola(); 

		Engine engine = new Engine();
		engine.setType("v6");  
		corola.setEngine(engine);  
		System.out.println(swift.getCar());       
		System.out.println(corola.getCar());      
		System.out.println(engine.getType());     
	}
}
