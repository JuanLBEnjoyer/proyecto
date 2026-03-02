package co.edu.uniquindio.proyecto.domain.entity;

import co.edu.uniquindio.proyecto.domain.valueobject.*;

import lombok.Getter;

@Getter
public class Usuario {

    private Documento documento;
    private String nombre;
    private Email email;
    private RolUsuario rol;

    public Usuario(Documento documento, String nombre, Email email, RolUsuario rol) {
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }
}
