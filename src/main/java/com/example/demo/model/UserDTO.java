package com.example.demo.model;

public class UserDTO {

  public UserDTO(){}

  private int id;
  private String nombre;
  private String apellido;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
