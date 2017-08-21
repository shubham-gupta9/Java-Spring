package shubham.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
