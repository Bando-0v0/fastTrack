
package caloriecounter;
import javax.swing.JOptionPane;


public class meals {
String username ;
int weight;
int goalweight;
int budget;
   
    int add = 1000;
    
// arrays will hold the meals that will be added by the users 
    String breakfast[] = new String[add];
    int breakfastCalories [] = new int[add];
    String lunch[] = new String[add];
    int lunchCalories [] = new int[add];
    String dinner[] = new String[add];
    int dinnerCalories [] = new int[add];

//arrays will hold the meals the can be onsumed and the amount of calories gained
    String cereal [] = {"Corn flakes", "Coco pops", "Rice crispies", "All bran flakes", "Musli", "wheet beeks", "Oats", "Future life"};
    int cerealCalories [] = {140, 200, 120, 106, 167, 126, 137, 175};
    String food [] = {"Rice","Pap","White bread","Brown Bread","Spagetti","Macaroni"};
    int starchCalories [] = {172, 100, 73, 62, 132, 147};
    String veggies [] = {"Potatoes", "Tomatoes", "carrots", "Cabbage", "Lettuce", "onion", "Green bell pepper", "Pumpkin", "Gem squash", 
        "asparagus", "Brulis sprout"};
    int veggieCalories [] = {134, 13, 55, 141, 98, 50, 32, 80, 13, 62};
    String protien [] = {"Steak", "Pork chop","Beef Wors", "Beef Mince", "Chicken breast", "Chicken thigh", "Chicken drumstick", "Chicken wing"};
    int protienCalories []= {188, 76 ,72,167, 167, 183, 90, 70};
    
    
//declarig the variable that will be used throught the program
  int options; 
  int search;
  int sum ;
  String meal;
  String starch;
  String veg;
  String meat;
  int starchCals;
  int vegCals;
  int meatCals;
  int total ;
  int breakfastTotal;
  int lunchtotal;
  int dinnertotal;
// these methods will be overrided throughout the program
    public void welcome(){
        JOptionPane.showMessageDialog(null, "Welcome to fast track");
    }
    protected void startLog(){
        JOptionPane.showMessageDialog(null, "This is your meal log");
    }
    protected void endLog(){
        JOptionPane.showMessageDialog(null, "This is the end of your log");
    }
}
