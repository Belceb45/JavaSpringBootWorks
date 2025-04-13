package org.example.ejemplo1.service;

import jakarta.annotation.PostConstruct;
import org.example.ejemplo1.model.Saludo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService
{

    private final Saludo2 saludo2;

    @Autowired
    public SaludoService(Saludo2 saludo2)
    {
        this.saludo2 = saludo2;
    }

    @PostConstruct
    public void init(){
        saludo2.setNombre("Beto");
    }


    public String saluda()
    {
        return "Hola " + saludo2.getNombre();
    }
}
