package caloriecounter;
import javax.swing.JOptionPane;

public class breakfast extends meals{
 //method override from the meals class
 @Override   
  protected void startLog(){
     do{
        // this will be how the meals are selected
        search=Integer.parseInt(JOptionPane.showInputDialog(
                "Breakfast\n"+
                "Please choose one of the following options\n"+
                "please choose save to end log\n"+
                "0. Save\n"+
                "1. Corn flakes\n"+ 
                "2. Coco pops\n"+
                "3. Rice crispies\n"+
                "4. All bran flakes\n"+ 
                "5. Musli\n"+
                "6. wheet beeks\n"+ 
                "7. Oats\n"+ 
                "8. Future life"));
         if(search < 1){
          JOptionPane.showMessageDialog(null, "item saved");
          }else{
        // using the loop to add the values to the array
        for(int i = 0; i < search; i ++){
           breakfast[i] = cereal[i]; 
           breakfastCalories[i] = cerealCalories [i]; 
           breakfastTotal = cerealCalories[i];
           total = 0 + breakfastTotal;
           sum = 1 ;
          //
        } 
                }
     }while(search >1);
           
        }
      
    
  @Override
    protected void endLog(){
      //the for loop will be use to display the values stored in the array  
        for(int m=0; m < sum; m++){
        JOptionPane.showMessageDialog(null, "For breakfast you chose: "+ breakfast[m]+ "\n"+ 
                "The calories for breakfast are: "+ breakfastTotal+ "\n"+
                "the total calories for the day are: "+ breakfastTotal);
        }
    }   
}
