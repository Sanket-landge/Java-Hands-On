import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Covid19{
   
      public static void main(String[] args){
          OkHttpClient client = new OkHttpClient();
          Request request = new Request.Builder().url("https://disease.sh/v2/all")
	.get()
	.build();

           try{
                 Response response = client.newCall(request).execute();
	String data = response.body().string();
	JSONParser jsonParser = new JSONParser();

	JSONObject jsonObject = (JSONObject)jsonParser.parse(data);
      	System.out.println("Total cases : "+jsonObject.get("cases"));
          	System.out.println("Recovered : "+jsonObject.get("recovered"));
	System.out.println("Critical : "+jsonObject.get("critical"));
	System.out.println("Active : "+jsonObject.get("active"));
	System.out.println("Today cases : "+jsonObject.get("todayCases"));
	System.out.println("Total deaths: "+jsonObject.get("deaths"));
	System.out.println("Today deaths: "+jsonObject.get("todayDeaths"));

            }
           catch( IOException | ParseException e)
                {
     	  e.printStackTrace();
               }
        }
}