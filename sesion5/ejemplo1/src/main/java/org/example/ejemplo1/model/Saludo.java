package org.example.ejemplo1.model;


public class Saludo
{

    private final String nombre;

    /*No usamos un setter porque no esperamos que se modifique la informacion,
      Ademas promueve la modificacion con instancias
    * */

    public Saludo(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

}