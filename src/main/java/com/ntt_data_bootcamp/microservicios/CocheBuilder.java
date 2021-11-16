package com.ntt_data_bootcamp.microservicios;

public class CocheBuilder {
	
	private String status;
	private String marca;
	private Integer nPuertas;
	
	public CocheBuilder status(String status) {
		this.status = status;
		return this;
	}
	
	public CocheBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public CocheBuilder nPuertas(Integer nPuertas) {
		this.nPuertas = nPuertas;
		return this;
	}
	
	public Coche build() {
		return new Coche(status,marca,nPuertas);
	}

}
