package caloriecounter;
import javax.swing.JOptionPane;

public class user extends meals{


public void createUser(){
    do{
        
    username = JOptionPane.showInputDialog("Please enter your name and surname");
    if(username.isBlank()){
        JOptionPane.showMessageDialog(null, "Invalid username");
    }else{
        JOptionPane.showMessageDialog(null, "Username successfully captured");
    }
        
    }while(username.isBlank());
    
    do{
     weight = Integer.parseInt(JOptionPane.showInputDialog("Please enter your current weight"));
     if(weight < 1){
        JOptionPane.showMessageDialog(null, "weight entry is invalid");
     }else{
        JOptionPane.showMessageDialog(null, "weight successfully captured");
    }
    }while(weight < 1);
    
    do{
     goalweight = Integer.parseInt(JOptionPane.showInputDialog("Please enter your goal weight"));
     if(goalweight < 1){
        JOptionPane.showMessageDialog(null, "weight entry is invalid");
     }else{
        JOptionPane.showMessageDialog(null, "weight successfully captured");
    }
    }while(goalweight < 1);
    
    budget = 0 +(23*goalweight);
    JOptionPane.showMessageDialog(null, "Your calories budget is: "+ budget);
    
}
}
