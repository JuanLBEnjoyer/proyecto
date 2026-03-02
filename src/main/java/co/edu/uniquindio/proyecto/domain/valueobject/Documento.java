package co.edu.uniquindio.proyecto.domain.valueobject;

import co.edu.uniquindio.proyecto.domain.exception.ExcepcionDeReglaDeDominio;

public record Documento(String numero, TipoDeDocumento tipo) {
    public Documento {
        if (numero == null || numero.isBlank()) {
            throw new ExcepcionDeReglaDeDominio("El numero del documento no puede estar vacio");
        }
        if (tipo == null) {
            throw new ExcepcionDeReglaDeDominio("El tipo del documento no puede estar vacio");
        }
        if (!tipo.equals(TipoDeDocumento.PASAPORTE) && !numero.matches("[0-9]+")) {
            throw new ExcepcionDeReglaDeDominio("El numero de documento no puede tener letras");
        }
    }
}
