package data.jpa.project.demo.controller;

import data.jpa.project.demo.entity.Empolye;
import data.jpa.project.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/{id}")
    public Empolye findById(@PathVariable Long id){
        return empService.findById(id);
    }
}
