package sistemaescolar;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class MyLoggingInterceptor implements Interceptor{

    private static final long serialVersionUID = 1L;

    public String intercept(ActionInvocation invocation) throws Exception {
        Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();

        Administrador administrador = (Administrador)sessionAttributes.get("USER");

        if(administrador==null){
            return "needLogin";
        }
        else{
            String className = invocation.getAction().getClass().getName();
            long startTime = System.currentTimeMillis();

            String result = invocation.invoke();

            long endTime = System.currentTimeMillis();
            return result;

        }


    }

    public void destroy() {
        System.out.println("Destroying MyLoggingInterceptor...");
    }
    public void init() {
        System.out.println("Initializing MyLoggingInterceptor...");
    }
}