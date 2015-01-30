package sistemaescolar.struts.servlet;

import com.google.gson.JsonObject;
import org.orm.PersistentTransaction;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 9:28 AM
 */
public class DeleteCircular extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter responseWriter = response.getWriter();
        responseWriter.print("Testing");

        String param = request.getParameter("circular_id");
        JsonObject jsonResponse = new JsonObject();


        if(param != null) {
            try {
                PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
                int id = Integer.parseInt(param);

                Circular circular = CircularDAO.getCircularByORMID(id);
                if(sistemaescolar.CircularDAO.delete(circular)) {
                    t.commit();
                    jsonResponse.addProperty("Result", "Success");
                }
                else
                    jsonResponse.addProperty("Result", "Failure");
            }
            catch (Exception e) {
                e.printStackTrace();
                jsonResponse.addProperty("Result", "Failure");
            }
        }

        responseWriter.print(jsonResponse);
    }
}
