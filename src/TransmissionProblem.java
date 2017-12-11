import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public class TransmissionProblem  implements CarProblemChain {
    @Override
    public String ProblemDesc() {
        return "TransmissionProblem";
    }

    @Override
    public float ProblemCost() {
        return 10000;
    }

    private CarProblemChain nextInChain;

    @Override
    public void setNextChain(CarProblemChain nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Car car, List<CarProblemChain> problem) {
        if(new ProblemIdentifier().IdentifyProblem("TransmissionProblem",problem))
        {
            new Analysis().printAnalysis(car,"TransmissionProblem","Transmission",ProblemCost());
        }
        else
            System.out.println("Exiting");
          //  nextInChain.SolveProblem(car,problem);
    }
}
