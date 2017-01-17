package com.bidon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ekansh on 12/7/15.
 */

@Controller
@ResponseBody
@RequestMapping(value = {"/person"})
public class PersonController {

	//APPLICATION_JSON
	
    @RequestMapping(value = "/", produces = "application/json", method = RequestMethod.GET)
    public ObjResponse index(){
    	
        System.out.println("Estou passando aki");
        
        ObjResponse objResponse = new ObjResponse();
        objResponse.setMiguel("haha");
        
        return objResponse;
    }




 


}
