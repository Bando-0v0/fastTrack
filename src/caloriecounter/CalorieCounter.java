package caloriecounter;
import javax.swing.JOptionPane;

public class CalorieCounter {
 /*
    this calories calculator works by choosing which food item the 
    user wishes to eat for the give menu the using this menus to trach the meal consumption
    */
   // this method wll call information from the class
    public static void main(String[] args) {
       user obj4 = new user();
    meals obj = new meals();
      breakfast obj1 = new breakfast();
      lunch obj2 = new lunch();
      dinner obj3 = new dinner();
int options;

   obj.welcome(); 
   do{
options = Integer.parseInt(JOptionPane.showInputDialog("Please choose one of the following option\n"+
        "1. get calorie budget\n"+
        "2. start log\n"+
        "3. end log\n"+
        "4. show calorie budget report\n"+ 
        "5. exit program"));
switch(options){
    case 1:
        obj4.createUser();
        
        break;
    case 2:
        options = Integer.parseInt(JOptionPane.showInputDialog("Which meal do you want to add\n"+
                "1. Breakfast\n"+ 
                "2. Lunch\n"+
                "3. dinner"));
        switch(options){
            case 1:
        obj1.startLog();
                  break;
            case 2:
        obj2.startLog();
                  break;
            default:
        obj3.startLog();
        }
        break;
    case 3:
        options = Integer.parseInt(JOptionPane.showInputDialog("Which meal do you want to add\n"+
                "1. Breakfast\n"+ 
                "2. Lunch\n"+
                "3. dinner"));
        switch(options){
            case 1:
        obj1.endLog();
                  break;
            case 2:
        obj2.endLog();
                  break;
            default:
        obj3.endLog();
        } 
        break;
    case 4:      
        JOptionPane.showMessageDialog(null, "You are on the fast track to a healthy body\n"+"Budget: " 
                + obj4.budget+"\n");
        break;
    default:
        JOptionPane.showMessageDialog(null, "Goodbye");
}
   }while(options < 5);
        
}   
    
}
