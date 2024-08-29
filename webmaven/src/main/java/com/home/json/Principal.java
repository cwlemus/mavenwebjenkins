package com.home.json;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String json = "{\"nombre\":\"pedro\"}";
		LeerJSonPersona leer = new LeerJSonPersona();
		Persona p = leer.getPersona(json);
		
		System.out.println(p.getNombre());
	}

}
