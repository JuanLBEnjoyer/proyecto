package co.edu.uniquindio.proyecto.domain.valueobject;

import co.edu.uniquindio.proyecto.domain.exception.ExcepcionDeReglaDeDominio;

public record CodigoSolicitud(String valor) {

    public CodigoSolicitud {
        if (valor == null || valor.isBlank()) {
            throw new ExcepcionDeReglaDeDominio("El codigo no puede ser nulo o vacío");
        }
        if (!valor.matches("[0-9]+")) {
            throw new ExcepcionDeReglaDeDominio("El codigo de solicitud solo puede contener numeros");
        }
    }

    @Override
    public String toString() {
        return valor;
    }

}
