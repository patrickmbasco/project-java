
public class ProjectTest {
    public static void main(String[] args){
        Project test = new Project("Patrick", "Boy");
        test.setName("Airpod");
        test.setDescription("Needs to charge");
        System.out.println(test.elevatorPitch());
    }
}