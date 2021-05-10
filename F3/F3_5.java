public class F3_5{
    public static void main(String[] args){
        Enrollee enrollee = new Enrollee();
        Class<?> clazz = enrollee.getClass();
        // ClassクラスのgetClass()メソッドでenrolleeのクラスを取得
        System.out.println(clazz.getName());
        // clazzの中になるenrolleeのクラス名をgetName()で取得
    }
}