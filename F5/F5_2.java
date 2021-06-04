import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import javax.json.bind.annotation.JsonbProperty;

public class F5_2{
    public static void main(String[] args){
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ00","小濱",70));
        // locator.add(new Enrolee("00AJ99","高野",90);
        print(locator);
    }

    public static void print(Object object){
        Class<?> clazz = object.getClass();
        for(Field field:clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(JsonbProperty.class)){
                Annotation annotation = field.getAnnotation(JsonbProperty.class);
                JsonbProperty property = JsonbProperty.class.cast(annotation);
                System.out.println(property.value());
            }
        }
    }
}

// javac -cp .:tdu-tool.jar:yasson-1.0.3.jar:javax.json-1.1.4.jar:javax.json.bind-api-1.0.jar F5_2.java
// java -cp .:tdu-tool.jar:yasson-1.0.3.jar:javax.json-1.1.4.jar:javax.json.bind-api-1.0.jar F5_2