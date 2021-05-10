import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class F3_9{
    public static void main(String[] args){
        Enrollee enrollee = new Enrollee("00AJ00","山田",70);
        Class<?> clazz = enrollee.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            try{
                String fName = field.getName();
                System.out.println(fName);
                PropertyDescriptor pd = new PropertyDescriptor(fName, clazz);
                System.out.println(pd);
                Method method = pd.getReadMethod();
                System.out.println(method);
                Object object = method.invoke(enrollee);
                System.out.println(object);
                System.out.println(object.toString());
            }catch(IntrospectionException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
        }
    }
}