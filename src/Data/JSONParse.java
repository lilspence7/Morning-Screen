package Data;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONParse {
    private static HttpURLConnection connection;


    //Takes a URL and returns the JSON Data in the form of an object
    public static JSONObject getDataFromLink(String url) throws Exception {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((line = reader.readLine()) != null) {
            responseContent.append(line);
        }
        reader.close();

        connection.disconnect();

        return new JSONObject(responseContent.toString());
    }
}
