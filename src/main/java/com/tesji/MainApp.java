package com.tesji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
  ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-context.xml");
 
  Administrador admin = (Administrador) appContext.getBean("admin"); 
  //admin.imprimirDireccion();
  
  System.out.println("::: " + admin);
  
  
  ((ClassPathXmlApplicationContext)appContext).close();
		
		
	}

}
