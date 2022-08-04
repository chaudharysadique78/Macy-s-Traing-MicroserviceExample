package com.example.eurekaclient.eurekanamingclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestExample {

	@GetMapping("/hello")
	String Hello()
	{
		return "Hello World";
	}
	
	@GetMapping("/hello/{name}")
	String HelloWithName(@PathVariable("name") String name)
	{
		return "Hello " + name;
	}

	@GetMapping("/hello_param")
	String HelloWithNameParamaeter(@RequestParam("name") String name)
	{
		return "Hello " + name;
	}
	
	@GetMapping("/hello_combined/{name}/")
	String HelloWithNameParamaeter(@PathVariable("name") String name,
			@RequestParam("name2") String name2)
	{
		return "Hello " + name + " " + name2;
	}
}
