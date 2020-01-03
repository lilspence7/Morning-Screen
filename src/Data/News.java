package Data;

import org.json.JSONArray;
import org.json.JSONObject;

public class News {
    private String key = "6c8e59652a80405d92ced1889f8051d4";

    public static String[] getNewsHeadlines() throws Exception {
        String[] headlines = new String[5];

        JSONArray articles = JSONParse.getDataFromLink("https://newsapi.org/v2/top-headlines?apiKey=6c8e59652a80405d92ced1889f8051d4&sources=cnn").getJSONArray("articles");
        for(int i = 0; i < 5; i++) {
            JSONObject article = articles.getJSONObject(i);
            String headline = article.getString("title");
            if (headline.endsWith("CNN Video")) {
                headline = headline.substring(0,headline.length()-12);
            }
            headlines[i] = headline;
        }

        return headlines;
    }
}
