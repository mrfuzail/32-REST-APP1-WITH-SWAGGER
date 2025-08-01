package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name") String name){
		
		String respPayload = name +         " , Welcome to Ashok It";
		
		return new ResponseEntity<>(respPayload, HttpStatus.OK); //recommended  //hit the URL Pattern in this way http://localhost:8080/welcome?name=Raju
		
	}

	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String respPayload= "Good Morning..!!";
		return respPayload;      // Http response object Status autoGenerate hoka //agar tumko http status khudkse controll nhi krne to ye use kr skte ho
	}
}


