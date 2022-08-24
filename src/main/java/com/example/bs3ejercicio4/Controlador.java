package com.example.bs3ejercicio4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador{

    @Qualifier("funcion3")
    @Autowired
    CommandLineRunner clr;


//    @GetMapping("controlador5")
//    public CommandLineRunner muestraParametros(@RequestParam String nombre, int edad, String poblacion){
//
//        return clr ->
//        {
//            System.out.println("Nombre: " + nombre + " Edad: " + edad + " Poblacion: " + poblacion);
//        };
//
//    }

    @PostMapping("controlador5")
    public CommandLineRunner muestraParametros(@RequestParam String nombre, int edad, String poblacion){

        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Poblacion: " + poblacion);
        return clr;
    }
}
