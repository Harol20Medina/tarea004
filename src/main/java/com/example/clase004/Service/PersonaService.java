package com.example.clase004.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.clase004.Dao.Todo;
import com.example.clase004.Entity.Persona;

@Service
public class PersonaService  implements Todo<Persona>{

	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
