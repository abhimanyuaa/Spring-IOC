package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Beans.Person;

public class PersonTest {

	
	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("resources/spring.xml");
		
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Person p=(Person) factory.getBean("p");		
		
		p.Display();
			
	}
}
