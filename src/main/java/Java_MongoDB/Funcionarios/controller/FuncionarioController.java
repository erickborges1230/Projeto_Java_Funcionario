package Java_MongoDB.Funcionarios.controller;


import Java_MongoDB.Funcionarios.Enty.Funcionario;
import Java_MongoDB.Funcionarios.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/listarFuncionario")
    public ResponseEntity<List<Funcionario>> listResponseEntity()
    {
        List<Funcionario> funcionarios = funcionarioService.listAll();
        return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
    }

}
