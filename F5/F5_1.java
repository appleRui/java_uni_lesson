public class F5_1{
    public static void main(String[] args){
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ00","Žā_",70));
        locator.add(new Enrollee("00AJ99","ė",90));

    for(Enrollee enrolee:locator){
        System.out.print(enrolee.getId() + "");
        System.out.print(enrolee.getName() + "");
        System.out.println(enrolee.getScore());
      }
    }
}