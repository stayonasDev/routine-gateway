package hello_routine_tracker.hello_routine_tracker_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloRoutineTrackerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRoutineTrackerGatewayApplication.class, args);
	}

}
