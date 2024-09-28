package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/task")
public class Task_controller {

	@Autowired
	private Task_service ts;
	
	@GetMapping
	public List<Task> getallTasks(){
		return ts.getAll();
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<Task> GetTaskById(@PathVariable Long Id){
		Task t = ts.getbyID(Id);
		return ResponseEntity.ok(t);  //entity ke through return krne ka kam hai ok ka
	}
	
	@DeleteMapping("/{Id}")
	public ResponseEntity<Void> DeleteTask(@PathVariable Long Id){
		ts.delete(Id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public Task CreateTask(@RequestBody Task t) {
		return ts.create(t);
	}
	
	@PutMapping("/{Id}")
	public ResponseEntity<Void> UpdateTask(@RequestBody Task t, @PathVariable Long Id){
		ts.update(t, Id);
		return ResponseEntity.noContent().build();	
	}
}