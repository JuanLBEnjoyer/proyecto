package co.edu.uniquindio.proyecto.domain.entity;

import co.edu.uniquindio.proyecto.domain.exception.ExcepcionDeReglaDeDominio;
import co.edu.uniquindio.proyecto.domain.valueobject.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolicitudTest {

    private final CodigoSolicitud codigo = new CodigoSolicitud("001");
    private final Documento solicitante = new Documento("123456", TipoDeDocumento.CEDULA);

    @Test
    void debeCrearSolicitudValida() {
        Solicitud solicitud = new Solicitud(
                codigo,
                "Registro de materias",
                solicitante,
                TipoDeSolicitud.REGISTRAR_ASIGNATURA
        );
        assertNotNull(solicitud);
        assertEquals(EstadoDeSolicitud.REGISTRADA, solicitud.getEstado());
        assertEquals("Registro de materias", solicitud.getDescripcion());
        assertEquals(1, solicitud.getHistorial().size());
    }
    @Test
    void noDebeCrearSolicitudConDescripcionVacia() {
        Exception ex = assertThrows(ExcepcionDeReglaDeDominio.class,
                () -> new Solicitud(
                        codigo,
                        "",
                        solicitante,
                        TipoDeSolicitud.CONSULTA_ACADEMICA
                ));
        assertEquals("La descripcion no puede estar vacia", ex.getMessage());
    }
    @Test
    void noDebeCrearSolicitudConDescripcionNula() {
        Exception ex = assertThrows(ExcepcionDeReglaDeDominio.class,
                () -> new Solicitud(
                        codigo,
                        null,
                        solicitante,
                        TipoDeSolicitud.CONSULTA_ACADEMICA
                ));
        assertEquals("La descripcion no puede estar vacia", ex.getMessage());
    }
    @Test
    void noDebeCrearSolicitudConTipoNulo() {
        Exception ex = assertThrows(ExcepcionDeReglaDeDominio.class,
                () -> new Solicitud(
                        codigo,
                        "Problema con el sistema",
                        solicitante,
                        null
                ));
        assertEquals("El tipo de solicitud no puede estar vacio", ex.getMessage());
    }
    @Test
    void debeClasificarSolicitudRegistrada() {
        Solicitud solicitud = new Solicitud(
                codigo,
                "Registro de materias",
                solicitante,
                TipoDeSolicitud.REGISTRAR_ASIGNATURA
        );
        solicitud.clasificar(PrioridadDeSolicitud.MEDIO);
        assertEquals(EstadoDeSolicitud.CLASIFICADA, solicitud.getEstado());
        assertEquals(PrioridadDeSolicitud.MEDIO, solicitud.getPrioridad());
        assertEquals(2, solicitud.getHistorial().size());
    }
    @Test
    void noDebeClasificarSolicitudQueNoEsteRegistrada() {
        Solicitud solicitud = new Solicitud(
                codigo,
                "Registro de materias",
                solicitante,
                TipoDeSolicitud.REGISTRAR_ASIGNATURA
        );
        solicitud.clasificar(PrioridadDeSolicitud.MEDIO);
        Exception ex = assertThrows(ExcepcionDeReglaDeDominio.class,
                () -> solicitud.clasificar(PrioridadDeSolicitud.MEDIO));
        assertEquals("Solo se puede clasificar una solicitud registrada", ex.getMessage());
    }
    
}