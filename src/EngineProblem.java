import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public class EngineProblem implements CarProblemChain {
    @Override
    public String ProblemDesc() {
        return "EngineProblem";
    }

    @Override
    public float ProblemCost() {
        return 25000;
    }

    private CarProblemChain nextInChain;

    @Override
    public void setNextChain(CarProblemChain nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Car car, List<CarProblemChain> problem) {
        if(new ProblemIdentifier().IdentifyProblem("EngineProblem",problem))
        {
            new Analysis().printAnalysis(car,"EngineProblem","Engine",ProblemCost());
            nextInChain.SolveProblem(car,problem);
        }
        else
            nextInChain.SolveProblem(car,problem);
    }
}
