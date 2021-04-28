import java.io.*;

import com.google.gson.Gson;
import org.json.simple.parser.*;
import org.springframework.web.client.RestTemplate;

class GetElevation {

        String url;

        public GetElevation() {
        }

        public GetElevation(String url) {
                this.url = url;
        }

        Integer getElevationValue(int longitude , int latitude) throws IOException, ParseException,Exception {

                RestTemplate restTemplate = new RestTemplate();
                String response = restTemplate.getForObject(url +"longitude="+ longitude +
                                "&latitude=" + latitude, String.class);
                Gson gson =new Gson();
                ReturnedElevClass myObj = gson.fromJson(response,ReturnedElevClass.class);
                return myObj.getHeight();

        }
}
