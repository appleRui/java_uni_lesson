import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class F7_2{
    public static void main(String[] args){
        String all = JsonUtils.readAll(Paths.get("data6.json"));
        JsonbConfig  jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        EnrolleeLocator locator = jsonb.fromJson(all, EnrolleeLocator.class);

        System.out.println(jsonb.toJson(locator));
    }
}