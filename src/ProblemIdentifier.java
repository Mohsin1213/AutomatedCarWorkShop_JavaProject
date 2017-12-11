import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/21/2017.
 */
public class ProblemIdentifier {
    public boolean IdentifyProblem(String request, List<CarProblemChain> probs)
    {
        for(CarProblemChain item: probs)
        {
           if(request.equals(item.ProblemDesc()))
           {
               return true;
           }
            // System.out.println("Item Cost "+item.ProblemCost());
        }
        return false;
    }
}
