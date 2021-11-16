package com.ntt_data_bootcamp.microservicios;

public class Singleton {
	
	private static Singleton instance;
	private Coche coche;
		
	
	public Singleton(Coche coche) {
		super();
		this.coche = coche;
	}


	public Singleton() {
		super();
	}


	public static Singleton getInstance(Coche coche) {
        if (instance == null) {
            instance = new Singleton(coche);
        }
        return instance;
    }


	public Coche getCoche() {
		return coche;
	}


	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	

}
