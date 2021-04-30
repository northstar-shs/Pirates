package kr.co.spock;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@SpringBootApplication
public class PiratesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiratesTestApplication.class, args);
	}

}
