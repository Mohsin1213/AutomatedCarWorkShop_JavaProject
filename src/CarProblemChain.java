import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/18/2017.
 */
public interface CarProblemChain {
    public String ProblemDesc();
    public float ProblemCost();
    public void setNextChain(CarProblemChain nextChain);
    public void SolveProblem(Car car,List<CarProblemChain> problem);


}
