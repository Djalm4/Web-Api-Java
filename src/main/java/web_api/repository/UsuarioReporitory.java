package web_api.repository;

import org.springframework.stereotype.Repository;
import web_api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioReporitory {
    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo usuario na camada de repositorio");
        }
        else
            System.out.println("UPDATE - Recebendo usuario na camada de repositorio");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - recebendo o ID: %d para deletar",id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Djalma", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo ", id));
        return new Usuario("Djalma", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usuario ao sistema", username));
        return new Usuario("Djalma", "password");
    }



}
