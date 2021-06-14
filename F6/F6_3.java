import java.nio.file.Path;
import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class F6_3{
    public static void main(String[] args){
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);

        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ03", "高野", 60));
        locator.add(new Enrollee("00AJ04", "山田", 80));

        // System.out.println(jsonb.toJson(locator));

        String jsonName = "date4.json";
        Path path = Paths.get(jsonName);
        JsonUtils.write(path, jsonb.toJson(locator));
    }
}