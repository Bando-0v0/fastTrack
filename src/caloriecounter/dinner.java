package caloriecounter;
import javax.swing.JOptionPane;

public class dinner extends meals {
    @Override
        protected void startLog(){
         do{
        search=Integer.parseInt(JOptionPane.showInputDialog(
                "Dinner:\n"+
                "Please choose one of the following options\n"+
                "Please enter save to end log\n"+
                "0. save\n"+
                "1. Rice\n"+
                "2. Pap\n"+
                "3. White bread\n"+
                "4. Brown Bread\n"+
                "5. Spagetti\n"+
                "6. Macaroni"));
        for(int n = 0; n < search; n++){
            dinner[n] = food[n];
            dinnerCalories[n] = starchCalories[n];  
        }
      
         }while(search > 1);
        
        do{
        search=Integer.parseInt(JOptionPane.showInputDialog(
                "Dinner:\n"+
                "Please choose one of the following options\n"+ 
                "0. save\n"+
                "1. Potatoes\n"+ 
                "2. Tomatoes\n"+ 
                "3. carrots\n"+ 
                "4. Cabbage\n"+ 
                "5. Lettuce\n"+ 
                "6. onion\n"+ 
                "7. Green bell pepper\n"+ 
                "8. Pumpkin\n"+ 
                "9. Gem squash\n"+ 
                "10. asparagus\n"+ 
                "11. Brulis sprout"));
       for(int i = 0; i < search; i ++){
           dinner[i] = veggies[i]; 
           dinnerCalories[i] = veggieCalories [i]; 
           
       }
      
        }while(search > 1);
        
        do{
        search=Integer.parseInt(JOptionPane.showInputDialog(
                "Dinner:\n"+
                "Please choose one of the following options\n"+ 
                "0. save\n"+
                "1. Steak\n"+ 
                "2. Pork chop\n"+
                "3. Beef Wors\n"+ 
                "4. Beef Mince\n"+ 
                "5. Chicken breast\n"+ 
                "6. Chicken thigh\n"+ 
                "7. Chicken drumstick\n"+ 
                "8. Chicken wing"));
        for(int m = 0; m < search; m ++){
           dinner[m] = protien[m]; 
           dinnerCalories[m] = protienCalories [m]; 
           dinnertotal= 0+ protienCalories[m]+ veggieCalories[m]+ starchCalories[m]+breakfastTotal+lunchtotal;
           sum = 1 ;
        }
        
        }while(search > 1);
        
    
        }
     @Override
    protected void endLog(){
        for(int n = 0; n< sum ; n++){
         JOptionPane.showMessageDialog(null, "For breakfast you chose: Dinner"+ "\n"+       
                "The calories for breakfast are: "+ dinnertotal+ "\n");
        }
    }
}
