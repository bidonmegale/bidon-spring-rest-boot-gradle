package com.bidon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(value = {"/person"})
public class PersonController {
	
    @RequestMapping(value = "/", produces = "application/json", 
    		method = RequestMethod.GET)
    public ObjResponse index(){
    	
        System.out.println("Estou passando aki");
        
        ObjResponse objResponse = new ObjResponse();
        objResponse.setMiguel("haha");
        
        return objResponse;
    }
}
