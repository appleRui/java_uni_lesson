import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class F5_4{
    public static void main(String[] args){
    String all = JsonUtils.readAll(Paths.get("date3.json"));

    Jsonb jsonb = JsonbBuilder.create();
    EnrolleeLocator locator = jsonb.fromJson(all, EnrolleeLocator.class);

    for(Enrollee enrollee:locator){
        System.out.print(enrollee.getId() + " ");
        System.out.print(enrollee.getName() + " ");
        System.out.println(enrollee.getScore());
    }
}
}