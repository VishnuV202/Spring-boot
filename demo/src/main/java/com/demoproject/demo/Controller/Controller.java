package com.demoproject.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.demo.Response.Response;
@RestController
public class Controller {
    @Value("$(Vishnu)")
    private String message;
    @GetMapping("/welcome")
    public Response welcome()
    {
        Response responseObj = new Response(202,"Vishnu","Venkatachalam");
        return responseObj;
        //return "Ain't a Sleep, Ain't a Ain't a FE!N";
    }

}
