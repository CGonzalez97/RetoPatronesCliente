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
		
		String open = "open";
		String close = "close";
		String halfOpen = "half-open";
		CocheBuilder builder = new CocheBuilder();
		Singleton singleton = Singleton.getInstance(builder.status(open).marca("Seat").nPuertas(5).build());
		Coche coche = singleton.getCoche();
		Service service = new Service();
		
		
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
