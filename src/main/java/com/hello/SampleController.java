package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//----- jar deployment ------
//@Controller
//@EnableAutoConfiguration
//public class SampleController {
//
//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }
//}


// ----- war deployment ------
@SpringBootApplication
//@EnableAutoConfiguration
@Controller
public class SampleController extends SpringBootServletInitializer {

	@RequestMapping("/")
	@ResponseBody
	String home() {
      return "Hello World,How are you ?";
  }
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleController.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}