package kr.ac.jbnu.se.awp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
	}
}