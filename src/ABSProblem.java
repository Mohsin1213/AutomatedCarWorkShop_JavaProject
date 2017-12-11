import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public class ABSProblem implements CarProblemChain {
    @Override
    public String ProblemDesc() {
        return "ABSProblem";
    }

    @Override
    public float ProblemCost() {
        return 7000;
    }

    private CarProblemChain nextInChain;

    @Override
    public void setNextChain(CarProblemChain nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Car car, List<CarProblemChain> problem) {
        if(new ProblemIdentifier().IdentifyProblem("ABSProblem",problem))
        {
            new Analysis().printAnalysis(car,"ABSProblem","ABS",ProblemCost());
            nextInChain.SolveProblem(car,problem);
        }
        else
            nextInChain.SolveProblem(car,problem);
    }
}
