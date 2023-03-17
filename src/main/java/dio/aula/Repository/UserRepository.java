package dio.aula.Repository;

import dio.aula.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Integer -> o id na classe user é Integer
public interface UserRepository extends JpaRepository<User, Integer> {
    //criando essa interface e extendendo ela de JpaRepository eu tenho todo ecositema de
    //save, findAll, delete, deleteAll, etc...
}
