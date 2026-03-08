# Glosario de Lenguaje Ubicuo

Este documento define los conceptos clave utilizados en el dominio del proyecto.

| Concepto                 | Definición                                                                                                                                              |
|:-------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Solicitud**            | Entidad principal que representa una petición realizada por un usuario. Contiene información como código, descripción, estado, prioridad y responsable. |
| **Usuario**              | Entidad que representa a una persona que interactúa con el sistema. Se identifica por su documento.                                                     |
| **Documento**            | Objeto de valor que representa el documento de identidad de un usuario.                                                                                 |
| **CodigoSolicitud**      | Identificador único de una solicitud.                                                                                                                   |
| **TipoDeSolicitud**      | Clasificación del tipo de solicitud realizada.                                                                                                          |
| **EstadoDeSolicitud**    | Estado actual en el ciclo de vida de una solicitud (REGISTRADA, CLASIFICADA, EN_ATENCION, ATENDIDA, CERRADA).                                           |
| **PrioridadDeSolicitud** | Nivel de urgencia asignado a una solicitud (BAJO, MEDIO, ALTO, URGENTE).                                                                                |
| **RegistroHistorial**    | Registro de un evento o cambio de estado en la historia de una solicitud.                                                                               |
| **Clasificar**           | Acción de asignar una prioridad a una solicitud y cambiar su estado a CLASIFICADA.                                                                      |
| **Asignar Responsable**  | Acción de asignar un usuario responsable para atender una solicitud y cambiar su estado a EN_ATENCION.                                                  |
| **Atender**              | Acción de marcar una solicitud como atendida, cambiando su estado a ATENDIDA.                                                                           |
| **Cerrar**               | Acción de finalizar el ciclo de vida de una solicitud, cambiando su estado a CERRADA.                                                                   |
| **RolUsuario**           | Rol que desempeña un usuario en el sistema.                                                                                                             |
| **Email**                | Dirección de correo electrónico de contacto de un usuario.                                                                                              |
