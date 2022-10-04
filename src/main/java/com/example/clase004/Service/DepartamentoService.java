package com.example.clase004.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.clase004.Dao.Todo;
import com.example.clase004.Entity.Departamento;


@Service
public class DepartamentoService implements Todo<Departamento>{

	@Override
	public int create(Departamento t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Departamento t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Departamento read(int id) {
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
