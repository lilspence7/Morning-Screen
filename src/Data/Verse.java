package Data;

import org.json.JSONObject;

public class Verse {
    public static String[] getVerse() throws Exception {
        String verse;
        String ref;
        String version;

        JSONObject dailyVerse = JSONParse.getDataFromLink("https://beta.ourmanna.com/api/v1/get/?format=json").getJSONObject("verse").getJSONObject("details");
        verse = dailyVerse.getString("text");
        ref = dailyVerse.getString("reference");
        version = dailyVerse.getString("version");

        String[] combinedVerse = {verse,ref,version};
        return combinedVerse;
    }
}
