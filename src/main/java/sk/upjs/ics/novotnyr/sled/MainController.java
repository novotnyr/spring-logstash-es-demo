package sk.upjs.ics.novotnyr.sled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	public String handle() {
		logger.info("Handling a request");
		return "OK";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainController.class);
	}
}
