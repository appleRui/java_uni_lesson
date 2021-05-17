public class F4_1{
    
    public static void main(String[] args){
        Enrollee enrollee = new Enrollee("00AJ00", "山田", 70);
        Instructor instructor = new Instructor("00SD00", "山中");
        print1(enrollee);
        print2(instructor);
        print(enrollee);
        print(instructor);
    }

    public static void print1(Enrollee enrollee){
        System.out.println("print1");
    }

    public static void print2(Instructor instructor){
        System.out.println("print2");
    }

    public static void print(Object object){
        System.out.println("print");
    }
}