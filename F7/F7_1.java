import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class F7_1{
    public static void main(String[] args){
        JsonbConfig  jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);

        EnrolleeLocator locator = new EnrolleeLocator();

        locator.add(new Enrollee("00AJ03","高野"));
        locator.add(new Enrollee("00AJ04","山田"));

        Enrollee enrollee1 = locator.get(0);
        enrollee1.add(new Score("数学", 80));
        enrollee1.add(new Score("プログラミング", 70));
        Enrollee enrollee2 = locator.get(1);
        enrollee2.add(new Score("数学", 30));
        enrollee2.add(new Score("プログラミング", 50));
        System.out.println(jsonb.toJson(locator));
        JsonUtils.write(Paths.get("data6.json"),jsonb.toJson(locator));
    }
}