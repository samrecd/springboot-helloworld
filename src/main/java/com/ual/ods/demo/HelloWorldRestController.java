package com.ual.ods.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldRestController {
	/**
	 * Gets all the segments from the table Flifo_SegmentMessage
	 * @return
	 */
	@RequestMapping(value = "/print/", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World !!";
	}
}