import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class F3_8{
    public static void main(String[] args){
        Enrollee enrollee = new Enrollee("00AJ00","山田",70);
        Class<?> clazz = enrollee.getClass();
        try{
            PropertyDescriptor pd = new PropertyDescriptor("id", clazz);
            // clazzの中でidという文字列を含んだものを取得
            Method method = pd.getReadMethod();
            // pdの中のゲッターを取得する
            Object object = method.invoke(enrollee);
            // invoke()の引数にenrrolleeを渡すことでgetIdを取得する
            System.out.println(object.toString());
        }catch(IntrospectionException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
