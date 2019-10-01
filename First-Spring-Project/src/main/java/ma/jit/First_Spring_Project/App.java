package ma.jit.First_Spring_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.jit.First_Spring_Project.model.Hotel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hotel hotel = context.getBean(Hotel.class);
		
		System.out.println(hotel);
	}
}
