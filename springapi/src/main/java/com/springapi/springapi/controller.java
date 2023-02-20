package com.springapi.springapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class controller {
    @Autowired
    private StuData studentservice;

    @GetMapping(value="/Student")
    public String getStudents(@RequestParam("display") String dis)
    {
        return this.studentservice.getStuData(dis);
    }
}
