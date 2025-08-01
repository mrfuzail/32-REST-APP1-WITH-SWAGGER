package in.ashokit.rest;

// Multiple Query Parameters ka use kiya hai

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
 
//	@GetMapping("/course")
//	public String getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
//		String respPayload= cname + tname + " Fee is 700 INR";	
//		return respPayload;            // with String is not recommended
//	}
//	
	@GetMapping("/course")
	public ResponseEntity<String> getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		String respPayload= cname +" "+ tname + " Fee is 700 INR";	
		return new ResponseEntity<>(respPayload, HttpStatus.OK);            // with String is not recommended
	}
	
	// hit this URL Pattern for this method http://localhost:8080/course?cname=JavaFSC&tname=Ashok
	
}
