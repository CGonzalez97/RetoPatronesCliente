package com.ntt_data_bootcamp.microservicios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviciosPracticaPatronesClienteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosPracticaPatronesClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Service service = new Service();
		
		String open = "open";
		String close = "close";
		String halfOpen = "half-open";
		CocheBuilder builder = new CocheBuilder();
		Coche coche = builder.status(open).marca("Seat").nPuertas(5).build();
		
		
		for(int i=0; i <= 5 && coche.getStatus().equals(open); i++) {
			coche.setStatus(halfOpen);
			service.setToHalfOpen();
			Thread.sleep(3000);
			if(i >= 3) {
				coche.setStatus(close);
				service.setToClose();
				Thread.sleep(3000);
			}else {
				coche.setStatus(open);
				service.setToClose();
				Thread.sleep(3000);
			}
			
		}
		
		
	}

}
