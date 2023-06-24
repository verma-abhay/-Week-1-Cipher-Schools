
class Car{
     String name;
     String color;
     int year;
     int maxspeed;
     void accelerate(){
         System.out.println("car is accelerating ");
     }
 }
 public class ClassObj{
     public static void main(String args[]){
       
         Car polo=new Car();
         
         System.out.println(polo.name);
         System.out.println(polo.color);
         System.out.println(polo.year);
         System.out.println(polo.maxspeed);
         
         polo.name="Polo";
         polo.color="yellow";
         polo.year=2016;
         polo.maxspeed=250;
         
          System.out.println(polo.name);
         System.out.println(polo.color);
         System.out.println(polo.year);
         System.out.println(polo.maxspeed);
         
     }
 }

