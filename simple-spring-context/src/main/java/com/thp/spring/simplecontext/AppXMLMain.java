package com.thp.spring.simplecontext;


import org.junit.Test; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppXMLMain {

	


    
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		/*ApplicationContext context = new FileSystemXmlApplicationContext
		         ("C:/Users/ZARA/workspace/HelloSpring/src/Beans.xml");*/
			
		//ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");

		
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
			Mousaillon mousaillon = new Mousaillon() ;
			
			mousaillon = (Mousaillon) context.getBean("mousaillon") ;
			
			
			System.out.println("Le prénom du mousaillon : " +   mousaillon.getFirstName()); 
			System .out.println("Le nom du moussaillon : " + mousaillon.getLastName()) ; 
			System .out.println("Configuration utilisée : " + mousaillon.getConfig()) ; 
			System .out.println("Bravo, vous venez de créer votre premier contexte Spring en XML!!") ; 
		      
		      
		    }
		
	
	
	}	



