package Java_MongoDB.Funcionarios.repository;

import Java_MongoDB.Funcionarios.Enty.Funcionario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends MongoRepository <Funcionario, ObjectId> { //Tá recebendo a Enty + obeject ID
}
