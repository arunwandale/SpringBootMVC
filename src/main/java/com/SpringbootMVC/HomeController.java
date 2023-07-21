package com.SpringbootMVC;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringbootMVC.Model.AlianModel;

@Controller
public class HomeController {
	
	@ModelAttribute // attribute at method level
	public void NameData(Model M) {
		java.util.Date date = new java.util.Date();		
		M.addAttribute("name",+date.getHours()+":"+date.getMinutes()+":"+date.getMinutes());
	} 
	
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("===========Calling home method===========");
		return "index";
	}
	
	@GetMapping("AlianMod")
	public String getAlians(Model mod) {
		List<AlianModel> lst = Arrays.asList(new AlianModel(101,"arun"),new AlianModel(102,"nana"));
		mod.addAttribute("list",lst); 
		return "ShowData";
	}	
	
	@RequestMapping("/adds")
	public String add(@RequestParam("num1") int a ,@RequestParam("num2") int b, ModelMap m) {
		
		int  c = a+b;		
		m.addAttribute("c",c);
		return "Result";
	}
	
	@RequestMapping("/addAlian")
	public String addAlian(@ModelAttribute("a") AlianModel Alian) { //modelAttribute
	
		return "Result";
	}
	
}
