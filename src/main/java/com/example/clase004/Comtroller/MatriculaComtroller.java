package com.example.clase004.Comtroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clase004.Service.MatriculaService;



@RestController
@RequestMapping("/api/alumno")
@CrossOrigin({"*"})

public class MatriculaComtroller {

	@Autowired
	private MatriculaService MatriculaService;
	
	@GetMapping("/all3")
	public List<Map<String, Object>> readAll(){		
		return MatriculaService.readAll();
	}
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return MatriculaService.readAll2();
	}
	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll3(){		
		return MatriculaService.readAll3();
	}
	
}
