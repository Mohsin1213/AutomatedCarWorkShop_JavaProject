import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public class EngineCheckLightProblem implements CarProblemChain {
    @Override
    public String ProblemDesc() {
        return "EngineCheckLightProblem";
    }

    @Override
    public float ProblemCost() {
        return 1000;
    }


    private CarProblemChain nextInChain;

    @Override
    public void setNextChain(CarProblemChain nextChain)
    {
        nextInChain = nextChain;
    }

    @Override

    public void SolveProblem(Car car, List<CarProblemChain> problem) {
        if(new ProblemIdentifier().IdentifyProblem("EngineCheckLightProblem",problem))
        {
            new Analysis().printAnalysis(car,"EngineCheckLightProblem","Engine Check Light",ProblemCost());
            nextInChain.SolveProblem(car,problem);
        }
        else
            nextInChain.SolveProblem(car,problem);
    }
}
