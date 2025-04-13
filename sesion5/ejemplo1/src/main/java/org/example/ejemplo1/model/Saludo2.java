package org.example.ejemplo1.model;


import org.springframework.stereotype.Component;

// Como una dependencia
@Component
public class Saludo2
{
    private final String nombre;

    public Saludo2()
    {
        this.nombre = "Beto";
    }

    public String getNombre()
    {
        return nombre;
    }
}
