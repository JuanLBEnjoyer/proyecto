package co.edu.uniquindio.proyecto.domain.entity;

import co.edu.uniquindio.proyecto.domain.valueobject.*;

public class Solicitud {

    private final String id;
    private final String descripcion;
    private final String idSolicitante;
    private TipoDeSolicitud tipo;
    private EstadoDeSolicitud estado;
    private PrioridadDeSolicitud prioridad;
    private String idResponsable;

    public Solicitud(String id, String descripcion, String idSolicitante, TipoDeSolicitud tipo,
            PrioridadDeSolicitud prioridad, String idResponsable) {
        this.id = id;
        this.descripcion = descripcion;
        this.idSolicitante = idSolicitante;
        this.tipo = tipo;
        this.estado = EstadoDeSolicitud.REGISTRADA;
        this.prioridad = prioridad;
        this.idResponsable = idResponsable;
    }

    public void clasificarSolicitud(TipoDeSolicitud tipo, PrioridadDeSolicitud prioridad) {
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.estado = EstadoDeSolicitud.CLASIFICADA;
    }

    public void asignarResponsable(String idResponsable) {
        this.idResponsable = idResponsable;
        this.estado = EstadoDeSolicitud.EN_ATENCION;
    }

    public void cerrar() {
        if (this.estado != EstadoDeSolicitud.ATENDIDA) {
            throw new IllegalArgumentException("Solo se puede cerrar una solicitud atendida");
        }
        this.estado = EstadoDeSolicitud.CERRADA;
    }

}
