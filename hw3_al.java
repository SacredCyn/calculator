
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FuzzyLogicCalJC{
   public static void main(String [] args){
      
      // Declare variables
      double totalDue=0.0;
      double lowTipRate=0.1;
      double mediumTipRate=0.15;
      double highTipRate=0.2;
      double tip=0.00;
      double tipPlusTotalDue=0.00;
      String keyboard;
      DecimalFormat format = new DecimalFormat("0.00");
      
      // Request food rating from user
      keyboard=JOptionPane.showInputDialog("Please rate the food: [0-2]"
                                              + "\n[0] - Tasteless"
                                              + "\n[1] - Good"
                                              + "\n[2] - Delicious");
      int food=Integer.parseInt(keyboard);
      
      // Request service rating from user
      keyboard=JOptionPane.showInputDialog("Please rate the service: [0-2]"
                                              + "\n[0] - Poor"
                                              + "\n[1] - Good"
                                              + "\n[2] - Excellent");
      int service=Integer.parseInt(keyboard);
      
      // Request overall experience rating from user
      keyboard=JOptionPane.showInputDialog("Please rate your experience: [0-4]"
                                              + "\n[0] - Poor"
                                              + "\n[1] - Fair"
                                              + "\n[2] - Neutral"
                                              + "\n[3] - Satisfactory"
                                              + "\n[4] - Outstanding");
      int experience=Integer.parseInt(keyboard);
      
      // Request total amount from user (in $)
      keyboard=JOptionPane.showInputDialog("Enter total amount from receipt: ");
      totalDue=Double.parseDouble(keyboard);
      
      
      // Calculate and display results to the user
      if(food ==0 || food <= 1 && service ==0 && service == 1 && experience ==0 || experience ==1){
         tip=totalDue*lowTipRate;
         tipPlusTotalDue=tip+totalDue;
         JOptionPane.showMessageDialog(null,"Amount billed: $" + format.format(totalDue)
                                          + "\nCalculated tip: $" + format.format(tip)
                                          + "\nTotal amount including tip: $" + format.format(tipPlusTotalDue)
                                          + "\n(Calculated tip is based on on your quality ratings)");
      }
      
      else if(food ==0 || food == 1 && service ==1 || service == 2 && experience ==3){
         tip=totalDue*mediumTipRate;
         tipPlusTotalDue=tip+totalDue;
         JOptionPane.showMessageDialog(null,"Amount billed: $" + format.format(totalDue)
                                          + "\nCalculated tip: $" + format.format(tip)
                                          + "\nTotal amount including tip: $" + format.format(tipPlusTotalDue)
                                          + "\n(Calculated tip is based on on your quality ratings)");
      }
      
      else if(food ==2 ||food == 3 && service >=2 || service == 2 && experience==4){
         tip=totalDue*highTipRate;
         tipPlusTotalDue=tip+totalDue;
         JOptionPane.showMessageDialog(null,"Amount billed: $" + format.format(totalDue)
                                          + "\nCalculated tip: $" + format.format(tip)
                                          + "\nTotal amount including tip: $" + format.format(tipPlusTotalDue)
                                          + "\n(Calculated tip is based on on your quality ratings)");
      }
      
      else 
         JOptionPane.showMessageDialog(null,"Does not exist ");
      
   }
}