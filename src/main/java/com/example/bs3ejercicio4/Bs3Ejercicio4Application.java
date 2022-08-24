package com.example.bs3ejercicio4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class Bs3Ejercicio4Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Bs3Ejercicio4Application.class, args);
    }

    @PostConstruct
    public void funcion1(){
        System.out.println("Hola desde clase inicial");
    }

    @Bean
    public CommandLineRunner funcion2(){
        return c ->
        {
            System.out.println("Hola desde clase secundaria");
        };
    }

    @Bean
    public CommandLineRunner funcion3(){
        return  c ->
        {
            System.out.println("Soy la tercera clase");
        };
    }

//    @Bean
//    public CommandLineRunner funcion3v2(){
//        return  c ->
//        {
//            mostrarParametros();
//        };
//    }
//
//    public void mostrarParametros(String nombre, int edad, String poblacion){
//        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Poblacion: " + poblacion);
//    }

    @Override
    public void run(String... args) throws Exception {

    }
}
