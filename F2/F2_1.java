public class F2_1{
    public static void main(String[] agrs){
        method1();
        F2_1 met2 = new F2_1();
        met2.method2();
    }
    public static void method1(){
        System.out.println("クラスメッソが呼ばれました");
    }
    public void method2(){
        System.out.println("インスタンスメッソが呼ばれました");
    }
}