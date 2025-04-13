package org.example.sesion6.controller;

import org.example.sesion6.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioControler {

    @PostMapping("/{id}/{rol}")
    public String creaUsuario(@RequestBody Usuario usuario, @PathVariable("id") Long id, @PathVariable("rol") String rol) {
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());
        System.out.println("Passwor: " + usuario.getPassword());
        System.out.println("Rol: " + rol);
        return "Usuario  " + id + "  Creado";
    }
}
