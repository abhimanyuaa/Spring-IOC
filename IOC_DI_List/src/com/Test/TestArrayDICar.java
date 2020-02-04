package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DI.Beans.Car;

public class TestArrayDICar {
public static void main(String[] args) {
	ApplicationContext contex =new ClassPathXmlApplicationContext("resources/SpringList.xml");
	Car c= (Car) contex.getBean("c"); 
	c.Display();



}
}
