import java.lang.annotation.aAnnotation;
import java.lang.reflect.Field;
import java.lang.annotation.aAnnotation;
import javax.json.bind.annotation.JsonProperty;

public class F5_2{
    public staic void main(String[] args){
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrolee("00AJ00","小濱",70);
        // locator.add(new Enrolee("00AJ99","高野",90);
        print(locator);
    }

    public void print(Object object){
        Class<?> clazz = object.getClass();
        for(Field fielf.clazz.getDeclaredFields()){
            if(field.isAnnocationPresent(JsonProperty.class){
                Annotation annotation = filed.getAnnocation(JsonProperty.class);
                JsonProperty property = JsonProperty.class.cast(annotation);
                System.out.println(property.value();
            }
        }
    }
}