package com.accenture.utilidades.fechas;

import java.time.DateTimeException;
import java.util.Date;

//Para la clase utilidades sus métodos deben ser públicos 

public class Fecha {
	
	public static int compararFechas(Date fechaUno,Date fechaDos) {
		int retorno= fechaUno.compareTo(fechaDos);
		return retorno;
		
	}

	public static int calcularDias (Date fechaInicio, Date fechaFin) {	
		try {// aqui va la logica que quiero controlar
			
			if (fechaInicio == null || fechaFin == null) {
				throw new DateTimeException("Las fechas no pueden ser null");
			}
			
			long diferencia =fechaFin.getTime() - fechaInicio.getTime();
			Long d= (diferencia/0);
			int dias =d.intValue();
			return dias;
			
		}
		catch(DateTimeException e) {//lo que quiero hacer cuando la excepción se genere
			System.err.println("He capturado el error");
			throw e;
			//try catch captura una excepción			
			//Como convertir el proyecto en libreria
		}
		catch (Exception e) {
			throw e;
		}
		
		finally {
			System.out.println("Me he ejecutado!!");
		}
	}		
	
}
