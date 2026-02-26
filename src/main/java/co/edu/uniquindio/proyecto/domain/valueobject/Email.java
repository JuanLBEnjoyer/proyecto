package co.edu.uniquindio.proyecto.domain.valueobject;

import co.edu.uniquindio.proyecto.domain.exception.ExcepcionDeReglaDeDominio;

public record Email(String valor) {

    public Email {
        if (valor == null || valor.isBlank()) {
            throw new ExcepcionDeReglaDeDominio("El email no puede ser nulo o vacío");
        }
        if (!valor.contains("@")) {
            throw new ExcepcionDeReglaDeDominio("El email no tiene el formato correcto");
        }
        if (!valor.endsWith("uniquindio.edu.co") && !valor.endsWith("uqvirtual.edu.co")){
            throw new ExcepcionDeReglaDeDominio("El email no pertenece a la institucion");
        }
    }

    @Override
    public String toString() {
        return valor;
    }

}
