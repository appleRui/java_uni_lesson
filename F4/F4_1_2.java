import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class F4_1_2{
    
    public static void main(String[] args){
        Enrollee enrollee = new Enrollee("00AJ00", "山田", 70);
        Instructor instructor = new Instructor("00SD00", "山中");
        // print1(enrollee);
        // print2(instructor);
        print(enrollee);
        print(instructor);
    }

    // public static void print1(Enrollee enrollee){
    //     System.out.println("print1");
    // }

    // public static void print2(Instructor instructor){
    //     System.out.println("print2");
    // }

    public static void print(Object object){
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            try{
                String fName = field.getName();
                PropertyDescriptor pd = new PropertyDescriptor(fName, clazz);
                Method method = pd.getReadMethod();
                Object met_object = method.invoke(object);
                System.out.print( fName + ":" + met_object.toString() + " ");
            }catch(IntrospectionException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
        }
    }
}