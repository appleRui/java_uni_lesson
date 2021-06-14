import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class F6_4{
    public static void main(String[] args){
        Path jsonPath = csv2json(Paths.get("date2.csv"), Paths.get("date5.json"));
        System.out.println(jsonPath.getFileName());
    }

    public static Path csv2json(Path csvPath, Path jsonPath){
        List<String> lists = CsvUtils.readAllLines(csvPath);
        System.out.println(lists);
        EnrolleeLocator locator = new EnrolleeLocator();
        for(EnrolleeLocator list:lists){
            locator.add(new Enrollee(list));
        }
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        JsonUtils.write(jsonPath, jsonb.toJson(locator));
        JsonUtils.write(jsonPath, jsonb.toJson(locator));
        return jsonPath;
    }
}