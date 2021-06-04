public class F5_1{
    public static void main(String[] args){
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ00","小濱",70));
        locator.add(new Enrollee("00AJ99","高野",90));

    for(Enrollee enrolee:locator){
        System.out.print(enrolee.getId() + "");
        System.out.print(enrolee.getName() + "");
        System.out.println(enrolee.getScore());
      }
    }
}

// javac -cp .:tdu-tool.jar:yasson-1.0.3.jar:javax.json-1.1.4.jar:javax.json.bind-api-1.0.jar F5_1.java
// java -cp .:tdu-tool.jar:yasson-1.0.3.jar:javax.json-1.1.4.jar:javax.json.bind-api-1.0.jar F5_1