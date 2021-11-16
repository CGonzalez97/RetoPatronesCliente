package com.ntt_data_bootcamp.microservicios;

public class Coche {
	
	private String status;
	private String marca;
	private Integer nPuertas;

	public Coche() {
		super();
	}

	public Coche(String status, String marca, Integer nPuertas) {
		super();
		this.status = status;
		this.marca = marca;
		this.nPuertas = nPuertas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(Integer nPuertas) {
		this.nPuertas = nPuertas;
	}

	
	
	

}
