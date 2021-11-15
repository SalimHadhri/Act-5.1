package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfigMain {

	
	
	
	public static void main(String[] args) {
		
		

		ApplicationContext context = new AnnotationConfigApplicationContext(AppMoussaillonConfig.class);
		
		
		/******************************* 1ere methode **************************/
		//Mousaillon mousaillon = context.getBean("moussaillon", Mousaillon.class);
		
		/******************************* 2eme methode **************************/

		Mousaillon mousaillon = (Mousaillon) context.getBean("moussa");
		
		
		System.out.println("Le prénom du mousaillon : " +   mousaillon.getFirstName()); 
		System .out.println("Le nom du moussaillon : " + mousaillon.getLastName()) ; 
		System .out.println("Configuration utilisée : " + mousaillon.getConfig()) ; 
		System .out.println("Bravo, vous venez de créer votre premier contexte Spring en XML!!") ; 
	      

		
	}

	
	
	
}
