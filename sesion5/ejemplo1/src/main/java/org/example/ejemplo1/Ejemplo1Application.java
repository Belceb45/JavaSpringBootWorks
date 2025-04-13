package org.example.ejemplo1;

import org.example.ejemplo1.model.Saludo;
import org.example.ejemplo1.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// La forma  de dependencia implicita es mas organica

// @SpringBootApplication
// public class Ejemplo1Application implements CommandLineRunner
// {

//     //Primera forma de inyeccion explicita de un Bean
//     // @Autowired
//     // private Saludo saludo;

//     // Segunda Forma
//     /*private Saludo saludo;

//     @Autowired
//     public void setSaludo(Saludo saludo)
//     {
//         this.saludo=saludo;
//     }
//     */

//     private final Saludo saludo;
//     // Tercera forma
//     //@Autowired tambien se puede poner por encima del constructor
//     public Ejemplo1Application(@Autowired Saludo saludo)
//     {
//         this.saludo=saludo;
//     }

//     public static void main(String[] args)
//     {
//         SpringApplication.run(Ejemplo1Application.class, args);

//     }

//    @Override
//     public void run(String... args) throws Exception
//    {
//         System.out.println(saludo.getNombre());
//    }
// }

@SpringBootApplication
public class Ejemplo1Application implements CommandLineRunner
{
    private final SaludoService saludoService;

    public Ejemplo1Application(@Autowired SaludoService saludoService)
    {
        this.saludoService = saludoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ejemplo1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println(saludoService.saluda());
    }
}