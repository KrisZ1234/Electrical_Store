public class ClosetStyle extends Fridge{
   final static String type = "Closet Style";

      public ClosetStyle(){
      }
      
      public ClosetStyle(String code, String name, int year,
                    String mnfc, double price,int store_count,
                    String energy_class, double main_capacity,
                    double frost_capacity){
        super(code,name,year,mnfc,price,store_count,energy_class,main_capacity,frost_capacity);
      }
}
