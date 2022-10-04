package com.example.clase004.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
	
	private int id;
	private Data anyo_inicio;
	private Data anyo_fin; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Data getAnyo_inicio() {
		return anyo_inicio;
	}
	public void setAnyo_inicio(Data anyo_inicio) {
		this.anyo_inicio = anyo_inicio;
	}
	public Data getAnyo_fin() {
		return anyo_fin;
	}
	public void setAnyo_fin(Data anyo_fin) {
		this.anyo_fin = anyo_fin;
	}
	{
		
	}

}
