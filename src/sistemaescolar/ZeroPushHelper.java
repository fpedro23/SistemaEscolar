package sistemaescolar;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * SistemaEscolar
 * Created by mng687 on 2/23/15 at 12:45 PM
 */
public class ZeroPushHelper {
    public static final String ANDROID_AUTH_KEY = "gcmdev_8MAgVC5GK9q2JPFQPyYu";
    public static final String BROADCAST_URL = "https://api.zeropush.com/broadcast";
    public static final String IOS_AUTH_KEY = "iosdev_Rqohwid72sxjNEqkpszG";

    public static String executePost(String targetURL, String urlParameters) {
        URL url;
        HttpURLConnection connection = null;
        try {
            //Create connection
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Length", "" +
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream ());
            wr.writeBytes (urlParameters);
            wr.flush ();
            wr.close ();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        } finally {

            if(connection != null) {
                connection.disconnect();
            }
        }
    }

    public static boolean sendBroadcast(String alert, String message) throws UnsupportedEncodingException {
        String response = executePost(BROADCAST_URL,
                "auth_token=" + URLEncoder.encode(ANDROID_AUTH_KEY, "UTF-8")
                + "&data[alert]=" + URLEncoder.encode(alert, "UTF-8")
                + "&data[message]=" + URLEncoder.encode(message, "UTF-8")
                + "&collapse_key=friend_request"
                + "&delay_while_idle=false"
                + "&time_to_live=40320"
        );

        String iosReponse = executePost(
                BROADCAST_URL,
                "auth_token=" + URLEncoder.encode(IOS_AUTH_KEY, "UTF-8")
                + "&badge=" + URLEncoder.encode("1+", "UTF-8")
                + "&sound=" + URLEncoder.encode(" ", "UTF-8")
                + "&alert" + URLEncoder.encode(alert, "UTF-8")
                + "&message" + URLEncoder.encode(message, "UTF-8")
                + "&collapse_key=friend_request"
                + "&delay_while_idle=false"
                + "&time_to_live=40320"
        );



        return response.contains("sent_count") && iosReponse.contains("sent_count");
    }
}
