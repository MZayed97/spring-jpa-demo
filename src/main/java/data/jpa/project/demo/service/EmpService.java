package data.jpa.project.demo.service;

import data.jpa.project.demo.entity.Empolye;
import data.jpa.project.demo.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public Empolye findById(Long id){
     return    empRepo.findById(id).orElseThrow();
    }
}
