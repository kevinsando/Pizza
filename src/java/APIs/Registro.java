package APIs;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import modelo.Usuario;
import modelo.dao.GestorBase;
/**
 *
 * @author Kevin
 */

@Path("registro")
public class Registro {
    
    @Context
    private UriInfo context;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Usuario usuario) {
        System.out.println("en registro...");
        try {
            GestorBase.obtenerInstancia().guardarUsuario(usuario);
        } catch (Exception ex) {
            System.out.println("EXCEPCION REGISTRO");
            throw new NotFoundException();
        }
    }
}
