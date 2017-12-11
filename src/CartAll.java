import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/19/2017.
 */
public class CartAll {
    List<CarProblemChain> probs=new ArrayList<CarProblemChain>();

    public void addItem(CarProblemChain item)
    {
        probs.add(item);
    }
    public float TotalCost()
    {
        float cost=0;
        for(CarProblemChain item :probs)
        {
            cost+=item.ProblemCost();
        }
        return cost;
    }
    public void ShowItem()
    {
        for(CarProblemChain item: probs)
        {
            System.out.println("Problem Identified  "+item.ProblemDesc());
            System.out.println("Item Cost "+item.ProblemCost());
        }
    }
}
