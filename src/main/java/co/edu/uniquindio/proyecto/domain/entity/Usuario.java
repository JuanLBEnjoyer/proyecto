package co.edu.uniquindio.proyecto.domain.entity;

import co.edu.uniquindio.proyecto.domain.valueobject.*;

import lombok.Getter;

@Getter
public class Usuario {

    private Documento documento;
    private String nombre;
    private Email email;

    public Usuario(Documento documento, String nombre, Email email) {
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
    }
}
