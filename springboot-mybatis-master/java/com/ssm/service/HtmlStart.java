package com.ssm.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HtmlStart {
 
 
    /*
    *   http://localhost:8080/hello?name=cn.7player
     */


    
	  @RequestMapping("/")
	    public String index() {
        return "index";
	    }
	  
	  @RequestMapping("/swagger")
	    public String swagger() {
      return "swagger";
	    }
	  
	  
	 
	  
	  
	    @RequestMapping("/file")
	    public String file() {
	        return "file";
	    }
	    
	    @RequestMapping("/test")
	    public String hello() {
		        return "test";
		    }
	    
	    @RequestMapping("/LoginSuccrss")
	    public String LoginSuccrss() {
		        return "LoginSuccrss";
		    }
		    
	    

		    
	    
	    
	    @RequestMapping("/login")
	    public String login() {
	       /* System.out.println("撒的撒的很少是uf骄傲啥都if就偶是滴啊佛i啊哈哈赛欧粉红丝带配合的送皮肤上大佛皮1");*/
	        return "login";
	    }
//	    
//	    

    
    
    
}