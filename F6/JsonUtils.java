import java.nio.charset.Charset;
import java.nio.file.Path;

public class JsonUtils{
    private static final Charset CHARSET = Charset.forName("UTF-8");

    public static String readAll(Path path){
        return PathUtils.readAll(path,CHARSET);
    }

    public static Path write(Path path, String all){
        return PathUtils.write(path,all, CHARSET);
    }
}
