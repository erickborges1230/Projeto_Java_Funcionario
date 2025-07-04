package Java_MongoDB.demo.repository;

import Java_MongoDB.demo.Enty.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends MongoRepository <Funcionario, Object> { //Tá recebendo a Enty + obeject ID
}
