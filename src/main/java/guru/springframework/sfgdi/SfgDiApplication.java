package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController)ap.getBean("myController");
		myController.sayHello();
		System.out.println(myController.sayHello());
	}

}
