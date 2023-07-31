package com.SpringbootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostmanAndRequestBody {

    @Autowired
	private Student student;
	
   
	/*  //student is supportive class for this 
	 * use Get: locahost:8080/homeRequest 
	 *  {
	 *  "name":"Arun wandale"
	 *  }
	 */
	
	@RequestMapping(value ="/homeRequest", method=RequestMethod.GET)
	@ResponseBody
	public Student home(@RequestBody Student stud) {
		System.out.println(""+ stud.getName());		
		return stud;  // will get sent to from where the / homeRequest called 
	}
	
	
}
