package dio.aula;

import dio.aula.Model.User;
import dio.aula.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Vitu");
        user.setUsername("Vihhstx");
        user.setPassword("dio123");

        //salvar usuario no banco local h2 (tipo um sqflite)
        repository.save(user);

        //printar todos os usuarios salvos
        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
