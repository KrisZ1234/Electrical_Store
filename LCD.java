public class LCD extends TV {
  final static String type = "LCD";

  public LCD(){
  }
  
  public LCD(String code, String name, int year,
            String mnfc, double price, int store_count,
            int screen_ratio, int resolution, String ports){
    super(code,name,year,mnfc,price,store_count,screen_ratio,resolution,ports);
  }
}