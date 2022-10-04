package com.example.clase004.Comtroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clase004.Entity.Profesor;



@RestController
@RequestMapping("/api/profesor")
@CrossOrigin({"*"})

public class ProfesorComtroller {
	
	@Autowired
	private Profesor ProfesorService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return ProfesorService.readAll2();
	}
	

}
