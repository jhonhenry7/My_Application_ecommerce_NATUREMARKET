package com.example.myapplicationecommerce.models;

public class UserModel {
    String name;
    String email;
    String contraseña;

    public UserModel() {
    }

    public UserModel(String nombre, String email, String contraseña) {
        this.name = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getName() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
