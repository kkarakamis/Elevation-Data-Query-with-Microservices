import org.springframework.web.client.ResourceAccessException;

public class Elevation {
    private GetElevation elevations;
    private String url;

    Elevation(){
        url = "http://127.0.0.1:8000/elevation-service/elevation?";
        elevations = new GetElevation(url);
    }

    Elevation(String url){
        this.url = url;
        elevations = new GetElevation(url);
    }

    public int getElevation(int longitude, int latitude) throws Exception {
        try {
            Integer value = elevations.getElevationValue(longitude,latitude);
            if(value == null){
                return -999999;
            } else{
                return value;
            }
        } catch (ResourceAccessException e) {
            System.out.println("Unknown Host exception");
        }
        catch (Exception e) {
            System.out.println("Unknown exception");
        }
        return -999999;
    }
}
