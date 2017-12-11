/**
 * Created by Ahtisham Zubair on 4/19/2017.
 */
public class Analysis {
    public void printAnalysis(Car car ,String Problem,String section,float cost)
    {
        System.out.println("===================");
        System.out.println(section.toUpperCase()+" Section");
        System.out.println("===================");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("Processing Please wait . ");
        for (int i=0;i<5;i++)
        {
            System.out.print(". ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done");
        System.out.println("Stats: ");
        System.out.println("Your car : "+car.CarNeme);
        System.out.println("Registration Number : "+car.CarRegisterationNum);
        System.out.println(Problem +" has been resolved");
        System.out.println("Cost : "+cost +"$");

        for (int i=0;i<5;i++)
        {
            System.out.print("** ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }
}
