package com.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrworker.entities.Worker;
import com.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workrepository;
	
	@PostMapping
	public ResponseEntity<List<Worker>> listAll() {
		List<Worker> list = workrepository.findAll();
		return ResponseEntity.ok(list);
	}
	
}
