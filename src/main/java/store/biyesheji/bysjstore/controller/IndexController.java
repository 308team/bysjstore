package store.biyesheji.bysjstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/customize")
	public String customize() {
		return "customize";
	}
	
	@RequestMapping("/contactus")
	public String contactus() {
		return "contactus";
	}


}
