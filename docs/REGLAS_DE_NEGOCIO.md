# Reglas de Negocio

Este documento lista las reglas de negocio del sistema, extraídas de las excepciones de dominio.


## Service

### AsignarResponsableService
- Un estudiante no puede ser responsable de una solicitud.

## Entity

### Solicitud
- El código de la solicitud no puede ser nulo.
- La descripción de la solicitud no puede estar vacía.
- El documento del solicitante no puede estar vacío.
- El tipo de solicitud no puede estar vacío.
- Solo se puede clasificar una solicitud que se encuentre en estado "Registrada".
- Solo se puede asignar un responsable a una solicitud que se encuentre en estado "Clasificada".
- Solo se puede atender una solicitud que se encuentre en estado "En Atención".
- Solo se puede cerrar una solicitud que se encuentre en estado "Atendida".

### Usuario
- El documento del usuario no puede ser nulo.
- El nombre del usuario no puede estar vacío.
- El email del usuario no puede ser nulo.
- El rol del usuario no puede ser nulo.

## Value Objects

### Email
- El email no puede ser nulo o vacío.
- El email debe tener un formato válido (contener "@").
- El email debe pertenecer a la institución (dominio `uniquindio.edu.co` o `uqvirtual.edu.co`).

### Documento
- El número del documento не puede estar vacío.
- El tipo del documento no puede estar vacío.
- El número de documento no puede contener letras, a menos que sea un pasaporte.

### CodigoSolicitud
- El código de la solicitud no puede ser nulo o vacío.
- El código de la solicitud solo puede contener números.
