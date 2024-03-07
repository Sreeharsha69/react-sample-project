package com.example.tunehubsample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class CallController {

	@GetMapping("/call")
	public String call() {
		System.out.println("call received by the back end");
		return "call received";
	}
	@PostMapping("/testpost")
	public String testPost(@RequestBody String data) {
		System.out.println("post request received: "+data);
		return "success";
	}
	@PostMapping("/testform")
	public String testForm(@RequestBody String formdata) {
		System.out.println("postform request received: "+formdata);
		return "success form";

}
}