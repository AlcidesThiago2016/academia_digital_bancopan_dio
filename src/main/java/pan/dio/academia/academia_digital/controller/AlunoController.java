package pan.dio.academia.academia_digital.controller;

import jakarta.validation.Valid;
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
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){
        return service.getAll(dataDeNascimento);
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAvaliacaoFisicaId(id);
    }

}
