package sv.edu.uesocc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingsDataServiceApplication {
	
	private static Logger logger = LogManager.getLogger(RatingsDataServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
		logger.info("------- Rating Data Services Started ------");
	}
}
