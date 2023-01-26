package cl.duoc.examenwebpayamb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExamenWebpayAmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenWebpayAmbApplication.class, args);
	}

}
