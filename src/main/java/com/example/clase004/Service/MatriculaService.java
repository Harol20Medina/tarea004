package com.example.clase004.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clase004.Dao.Todo;
import com.example.clase004.Daoimpl.MatriculaDaoimpl;
import com.example.clase004.Entity.Matricula;

@Service
public class MatriculaService implements Todo<Matricula> {

	@Autowired
	private MatriculaDaoimpl daoIMpl;
	@Override
	public int create(Matricula t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Matricula t) {
		// TODO Auto-generated method stub
		return daoIMpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.delete(id);
	}

	@Override
	public Matricula read(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.read(id);
	}

	@Override
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll3();
	}
}
	
