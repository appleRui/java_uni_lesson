import java.nio.file.Paths;

public class F5_3{
    public static void main(String[] args){
        String all = JsonUtils.readAll(Paths.get("date3.json"));

        System.out.println(all);
    }
}