package api1.master;


import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {
	"api1.master.controller",
	"api1.master.dto",
	"api1.master.service",
	"api1.master"
})
@EnableScheduling
public class MasterApplication {

	protected Logger logger = Logger.getLogger(getClass().getCanonicalName().toString());

	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		logger.info("api: Started!");
	}

}
