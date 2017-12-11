import javax.print.DocFlavor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ahtisham Zubair on 4/20/2017.
 */
public class InputHandler {
    String[] input=new String[8];
    String[] inputCaptured=new String[5];
int count=0;
    public List<CarProblemChain> TakeInput(String name,String RegNum)
    {
        for(int i=0;i<inputCaptured.length;i++)
        {
            inputCaptured[i]="";
        }
      input[0]="0:Abs Problem";
      input[1]="1:Engine Check Light Problem";
      input[2]="2:Engine Problem";
      input[3]="3:Oil Problem";
      input[4]="4:Transmission Problem";
      input[5]="5:Lets Work";
        while(true) {
            String items=ShowItem();
            if(!(items.equals("")))
                System.out.println("Current Item(s) in cart : "+ items.substring(2));
            System.out.println("\t\t\t\t\t\t\t\t\t" + "Identify Basic Problem with your " + name.toUpperCase() + " ( " + RegNum.toUpperCase() + ")");
            System.out.println("\t\t\t\t\t\t\t" + "========================================================================");
          for(int i=0;i<input.length;i++)
          {
              boolean flag=false;
              for (int j=0;j<inputCaptured.length;j++)
              {
                  if(!(inputCaptured[j].equals("")))
                  {
                      if(inputCaptured[j].equals(String.valueOf(i)))
                      {
                          flag=true;
                      }
                  }
              }
              if(!flag)
                    System.out.println(input[i]);
          }

            System.out.println("Select Option :  ");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if(Integer.parseInt(option) <5) {
                probs.add(option.equals("0") ? new ABSProblem() : option.equals("1") ? new EngineCheckLightProblem() : option.equals("2") ? new EngineProblem() : option.equals("3") ? new OilChange() : option.equals("4") ? new TransmissionProblem() : null);
            inputCaptured[count]=option;
            count=count+1;
            }
            else
            {
              //  String[] ProbToSolve=RectifyMeName(inputCaptured);
                return probs;
            }
          //  System.out.println("Current Item(s)"+ ShowItem().substring(2));

            Pagebreaker();
        }


    }

    private String[] RectifyMeName(String[] inputCaptured) {
        String[] namesOfProblem=new String[inputCaptured.length];
        for(int i=0;i<namesOfProblem.length;i++)
        {
            if(!(inputCaptured[i].equals("")))
            {
                namesOfProblem[i] = input[Integer.parseInt(inputCaptured[i])];
            }
        }
        return namesOfProblem;
    }

    private void Pagebreaker() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    static List<CarProblemChain> probs=new ArrayList<CarProblemChain>();

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
    public String ShowItem()
    {
        String msg="";
        for(CarProblemChain item: probs)
        {
            msg+=" , "+item.ProblemDesc();
           // System.out.println("Item Cost "+item.ProblemCost());
        }
        return  msg;
    }
}
