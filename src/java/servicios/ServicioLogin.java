package servicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;
import modelo.dao.GestorBase;

/**
 *
 * @author Kevin
 */
@WebServlet(name = "ServicioLogin", urlPatterns = {"/ServicioLogin"})

@MultipartConfig
public class ServicioLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            JSONObject r = new JSONObject();

            Enumeration<String> p = request.getParameterNames();

            while (p.hasMoreElements()) {
                String n = p.nextElement();
                System.out.println("Elemento: " + n);
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
            

            boolean usuarioValido = false;
            String usuario = r.get("usuario").toString();
            String password = r.get("clave").toString();

            if (usuario != null && password != null) {
                usuarioValido = servicio.verificarUsuario(usuario, password);
                System.out.println("usuarioValido: "+usuarioValido);
            }
            if (usuarioValido) {
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("usuario", usuario);
                out.println("OK");
                System.out.println("OK");
                request.setAttribute("usuario", usuario);
                request.setAttribute("clave", password);
                
                response.sendRedirect("inicio.jsp");

            } else {
                System.out.println("ERROR");
                out.println("ERROR");
                response.sendRedirect("Registro.jsp");
            }

            System.out.printf("Datos enviados:\n%s\n", r.toString(4));

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
    }
    GestorBase servicio = new GestorBase();

}
