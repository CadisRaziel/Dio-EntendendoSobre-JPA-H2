package dio.aula.Model;

import javax.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {
    //@Id -> Minha chave primaria (ou seja aqui eu coloquei em cima do 'id' então o id é minha chave primaria
    //@GeneratedValue -> Estou dizendo banco, voce precisa ter uma estrutura de identificação para eu ter o id correspondente a cada inserção do meu usuario "entidade"
    //@Column(name = "user_id") -> estou dizendo que o id no banco de dados vai se chamar 'user_id'
    //@Column(length = 50, nullable = false) -> vai aceitar até 50 caracteres e nao pode ser nula
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    //LEMBRANDO
    //QUANDO NAO CRIAMOS CONSTRUTOR POR DEFAULT O PROPRIO JAVA CRIA UM CONSTRUTOR VAZIO !!!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User => {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
