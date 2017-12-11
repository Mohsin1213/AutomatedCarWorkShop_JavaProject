import javax.print.DocFlavor;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ahtisham Zubair on 4/19/2017.
 */
public class Main {
    public static void main(String args[]) throws InterruptedException {
        CarProblemChain chain1=new ABSProblem();

        CarProblemChain chain2=new EngineCheckLightProblem();
        CarProblemChain chain3=new EngineProblem();
        CarProblemChain chain4=new OilChange();
        CarProblemChain chain5=new TransmissionProblem();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        System.out.println("Enter Your car Model ?");
        Scanner sc= new Scanner(System.in);
        String ModelName=sc.nextLine();
        System.out.println("Enter Your car Model ?");
        String RegNum=sc.nextLine();
        List<CarProblemChain> probs= new InputHandler().TakeInput(ModelName,RegNum);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Conveyor Belt Started");


        Car car= new Car(ModelName,RegNum);
        chain1.SolveProblem(car,probs);


    }
}
