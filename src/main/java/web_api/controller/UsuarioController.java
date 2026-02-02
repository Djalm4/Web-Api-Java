package web_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web_api.model.Usuario;
import web_api.repository.UsuarioReporitory;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioReporitory reporitory;

    @GetMapping()
    public List<Usuario> getUsers(){
        return reporitory.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return reporitory.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        reporitory.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        reporitory.save(usuario);
    }

}
