import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lasagna {
   public int expectedMinutesInOven(){
       return 40;
   }
   public int remainingMinutesInOven(int actualMinutesInTheOven){
       return expectedMinutesInOven() - actualMinutesInTheOven;
   }
   public int preparationTimeInMinutes(int layers){
       return layers*2;
   }
   public int  totalTimeInMinutes(int layers, int actualMinutesInTheOven ){
        return preparationTimeInMinutes( layers ) + actualMinutesInTheOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));
    }
}