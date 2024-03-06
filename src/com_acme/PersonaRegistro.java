package com_acme;

public record PersonaRegistro(String nombre, String apellidos){

    @Override
    public String toString(){
        //Se comentó una línea inservible
        System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}

