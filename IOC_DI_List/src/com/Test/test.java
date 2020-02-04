package com.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.DI.Beans.Question;
import com.DI.Beans.Student;

public class test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		// Question q = (Question) factory.getBean("q");
		// q.displayInfo();

		Student s = (Student) factory.getBean("s");
		s.display();

	}
}
