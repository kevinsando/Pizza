/*package servicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.dao.GestorBase;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * 
 * EIF209
 * Programación 4
 * Proyecto #2
 * Junio 2020
 * Autores:
 *         - 207900913 Kevin Sandoval Madrigal
 *         - 000000000 Mariana Valverde Mora
 *         - 000000000 Miguel Rodriguez Rangel
 *//*
@WebServlet(name = "ServicioRegistro", urlPatterns = {"/ServicioRegistro"})

@MultipartConfig
public class ServicioRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            JSONObject r = new JSONObject();

            Enumeration<String> p = request.getParameterNames();

            while (p.hasMoreElements()) {
                String n = p.nextElement();
                String[] v = request.getParameterValues(n);
                if (v.length == 1) {
                    r.put(n, v[0]);
                } else {
                    JSONArray a = new JSONArray();
                    for (String s : v) {
                        a.put(s);
                    }
                    r.put(n, a);
                }
            }
            String id = r.get("id").toString();
            String usuario = r.get("usuario").toString();
            String clave = r.get("clave").toString();
            String nombre = r.get("nombre").toString();
            String apellidos = r.get("apellidos").toString();
            String direccion = r.get("direccion").toString();
            int rol = Integer.parseInt(r.get("rol").toString());
            int telefono = Integer.parseInt(r.get("tel").toString());

            Usuario u = new Usuario(id, usuario, clave, nombre, apellidos, direccion, rol, telefono);
            System.out.println("Usuario: " + u.toString());
            try {
                servicio.guardarUsuario(u);
            } catch (SQLException ex) {
                Logger.getLogger(ServicioRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.println("OK");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    GestorBase servicio = new GestorBase();

}
*/