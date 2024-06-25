package org.cornercoding.sonarclouddemo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@RequestMapping(value="/api/v1,0/capitalize")
	public ResponseEntity<String> capitalize(@RequestParam("test") String text){
		
		String capital = text.toUpperCase();

		String s1 = "test";
		String s2 = "test";

		String s3;
		
		return ResponseEntity.ok(capital);
		
	}

	private int m1() {
		return 1;
	}

	private int m2() {
		return 1;
	}

}
