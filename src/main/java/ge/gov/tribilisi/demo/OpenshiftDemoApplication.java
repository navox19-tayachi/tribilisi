package ge.gov.tribilisi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenshiftDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoApplication.class, args);
		System.out.println("Hello World !");
	}

}
