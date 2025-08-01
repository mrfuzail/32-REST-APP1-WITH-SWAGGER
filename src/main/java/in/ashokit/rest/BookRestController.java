package in.ashokit.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;


@RestController
public class BookRestController {
	
	@Operation(summary = "Get employee by ID", description = "Returns employee object for given ID")  //swagger
	
	@GetMapping("/book/{name}")           // here we are learing Path Parameter or Path Varibale concept
	public ResponseEntity<String> getBookPrice(@PathVariable("name")String name){
		
		String respPlayload = name + " price is 100 INR";
		
		return new ResponseEntity<>(respPlayload, HttpStatus.OK);    // iska URL Pattern http://localhost:8080/book/spring
		
	}
	
	@GetMapping("/book/name/{bname}/author/{aname}")           // here we are learing Path Parameter or Path Varibale concept
	public ResponseEntity<String> getBook(@PathVariable("bname")String bname, @PathVariable("aname")String aname){
		
		String respPlayload = bname + " by " + " Author "+ aname + " is out of Stock"; 
		
		return new ResponseEntity<>(respPlayload, HttpStatus.OK);	 // iska URL Pattern http://localhost:8080/book/name/spring/author/rodjohnson
		
	}

}
