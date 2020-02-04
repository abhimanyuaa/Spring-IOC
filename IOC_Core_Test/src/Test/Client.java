package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Resource resource= new ClassPathResource("resources/spring.xml");
		  
		 
		//Core Container
		  BeanFactory beanFactory= new XmlBeanFactory(resource);	 
		  System.out.println("valid Documnet");
		  beanFactory.getBean("t");
		  beanFactory.getBean("t");
		  beanFactory.getBean("t");
		  beanFactory.getBean("t");	
		 
		  //J2ee Container
		/*
		 * ApplicationContext ap = new
		 * ClassPathXmlApplicationContext("resources/spring.xml"); ap.getBean("t");
		 * ap.getBean("t"); ap.getBean("t"); ap.getBean("t");
		 */
	
	}

}
