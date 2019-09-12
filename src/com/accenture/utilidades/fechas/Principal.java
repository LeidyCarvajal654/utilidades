package com.accenture.utilidades.fechas;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El número de días es: "+Fecha.calcularDias(new Date(args[0]), new Date (args[1])));
	}

}
