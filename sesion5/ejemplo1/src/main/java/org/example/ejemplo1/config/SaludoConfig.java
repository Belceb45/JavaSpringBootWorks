package org.example.ejemplo1.config;


import org.example.ejemplo1.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SaludoConfig
{
    @Bean
    public Saludo saludo()
    {
        return new Saludo("Beto");

    }



}
