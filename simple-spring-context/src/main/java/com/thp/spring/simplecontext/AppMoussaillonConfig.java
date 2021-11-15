package com.thp.spring.simplecontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppMoussaillonConfig {
	
	

   @Bean(name="moussa")
   public Mousaillon moussaillon() {
	   
      Mousaillon moussaillon = new Mousaillon();
      moussaillon.setFirstName("Johnny");
      moussaillon.setLastName("Depp");
      moussaillon.setConfig("Java");
      return moussaillon;
      
   }
   
   
   
   
}
