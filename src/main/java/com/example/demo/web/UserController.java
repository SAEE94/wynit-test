package com.example.demo.web;

import com.example.demo.model.UserDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
@CrossOrigin("*")
public class UserController {

  private static List<UserDTO> usuarios = new ArrayList<>();

  @PostMapping()
  public UserDTO guardarUsuario( @RequestBody UserDTO usuario ) {
    usuario.setId(usuarios.size() + 1);
    usuarios.add( usuario );
    return usuario;
  }

  @GetMapping()
  public  List<UserDTO> getUsuarios(){
    return usuarios;
  }
}
