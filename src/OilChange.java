import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public class OilChange  implements CarProblemChain {
    @Override
    public String ProblemDesc() {
        return "OilChange";
    }

    @Override
    public float ProblemCost() {
        return 3000;
    }

    private CarProblemChain nextInChain;

    @Override
    public void setNextChain(CarProblemChain nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Car car, List<CarProblemChain> problem) {
        if(new ProblemIdentifier().IdentifyProblem("OilChange",problem))
        {
            new Analysis().printAnalysis(car,"OilChange","Oil Change",ProblemCost());
            nextInChain.SolveProblem(car,problem);
        }
        else
            nextInChain.SolveProblem(car,problem);
    }
}
