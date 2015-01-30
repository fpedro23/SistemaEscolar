package sistemaescolar.struts.servlet;

import com.google.gson.JsonObject;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 10:00 AM
 */
public class UpdateCircular extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter responseWriter = response.getWriter();
        JsonObject jsonResponse = new JsonObject();
        String paramId = request.getParameter("circular_id");

        try {
            PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
            Circular circular = CircularDAO.getCircularByORMID(Integer.parseInt(paramId));

            if(request.getParameter("titulo") != null)
                circular.setTitulo(request.getParameter("titulo"));
            if(request.getParameter("fecha") != null)
                circular.setFecha(request.getParameter("fecha"));
            if(request.getParameter("remitente") != null)
                circular.setRemitente(request.getParameter("remitente"));
            if(request.getParameter("contenido") != null)
                circular.setContenido(request.getParameter("contenido"));

            t.commit();
            jsonResponse.addProperty("Result", "Success");
        }
        catch (Exception e) {
            e.printStackTrace();
            jsonResponse.addProperty("Result", "Failure");
        }

        responseWriter.println(jsonResponse);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
