package pan.dio.academia.academia_digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.dio.academia.academia_digital.entity.Aluno;
import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;
import pan.dio.academia.academia_digital.entity.form.AlunoForm;
import pan.dio.academia.academia_digital.service.impl.AlunoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

}
