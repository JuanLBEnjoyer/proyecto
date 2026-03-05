package co.edu.uniquindio.proyecto.domain.entity;

import co.edu.uniquindio.proyecto.domain.valueobject.Documento;
import co.edu.uniquindio.proyecto.domain.valueobject.Email;
import co.edu.uniquindio.proyecto.domain.valueobject.RolUsuario;
import co.edu.uniquindio.proyecto.domain.valueobject.TipoDeDocumento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsuarioTest {

    private Documento documento = new Documento("123456", TipoDeDocumento.CEDULA);
    private Email email = new Email("usuario@uniquindio.edu.co");

    @Test
    void debeCrearUsuarioValido() {
        Usuario usuario = new Usuario(
                documento,
                "Daniel Garcia",
                email,
                RolUsuario.ESTUDIANTE
        );
        assertNotNull(usuario);
    }
    @Test
    void debeCrearUsuarioConRolResponsable() {
        Usuario usuario = new Usuario(
                documento,
                "Daniel Garcia",
                email,
                RolUsuario.ESTUDIANTE
        );
        assertNotNull(usuario);
    }
    @Test
    void debePermitirCrearMultiplesUsuariosConDatosDiferentes() {
        Documento documento2 = new Documento("789456", TipoDeDocumento.CEDULA);
        Email email2 = new Email("usuario2@uniquindio.edu.co");
        Usuario usuario1 = new Usuario(
                documento,
                "Daniel Garcia",
                email,
                RolUsuario.ESTUDIANTE
        );
        Usuario usuario2 = new Usuario(
                documento2,
                "Maria Lopez",
                email2,
                RolUsuario.ESTUDIANTE
        );
        assertNotEquals(usuario1, usuario2);
    }
}
