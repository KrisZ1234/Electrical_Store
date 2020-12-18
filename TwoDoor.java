public class TwoDoor extends Fridge{
   final static String type = "Two door";

      public TwoDoor(){
      }

      public TwoDoor(String code, String name, int year,
                    String mnfc, double price,int store_count,
                    String energy_class, double main_capacity,
                    double frost_capacity){
        super(code,name,year,mnfc,price,store_count,energy_class,main_capacity,frost_capacity);
      }
}