import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {

    public void converte(String moedaBase, String moedaAlvo, double value) throws IOException {
        String link = "https://v6.exchangerate-api.com/v6/19c244aefead1ecb028a8af9/pair/" + moedaBase + "/" + moedaAlvo + "/" + value;

        URL url = new URL(link);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        String req_result = jsonobj.get("conversion_result").getAsString();
        String result = "O resultado é de " + value + " " + moedaBase + " para " + moedaAlvo + " tem o valor final de " + req_result;
        System.out.println(result);
    }
}
