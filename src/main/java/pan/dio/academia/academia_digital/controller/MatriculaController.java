package pan.dio.academia.academia_digital.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.dio.academia.academia_digital.entity.Matricula;
import pan.dio.academia.academia_digital.entity.form.MatriculaForm;
import pan.dio.academia.academia_digital.service.impl.MatriculaServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        return service.getAll(bairro);
    }
}
