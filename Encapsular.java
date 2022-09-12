package com.OpenBootcam;

public class Encapsular {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("leo");
        persona.setTelefono(304531631);


        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
    class Persona{
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void  setNombre(String nombre){
            this.nombre = nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public String getNombre(){
            return this.nombre;
        }
        public  int getEdad(){
            return this.edad;
        }
        public int getTelefono(){
            return this.telefono;
        }
    }


