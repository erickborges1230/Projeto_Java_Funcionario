package Java_MongoDB.Funcionarios.Service;

import Java_MongoDB.Funcionarios.Enty.Funcionario;
import Java_MongoDB.Funcionarios.Funcionario_Application;
import Java_MongoDB.Funcionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionariosServiceImplement implements FuncionarioService {

    //Criando uma injeção de dependência do FuncionarioRepository
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Override
    public List<Funcionario> listAll(){
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarioRepository.findAll().forEach(funcionarios::add);
        return funcionarios;
    }

}
