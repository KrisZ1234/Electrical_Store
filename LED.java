public class LED extends TV {
  final static String type = "LED";

  public LED(){
  }

  public LED(String code, String name, int year,
            String mnfc, double price, int store_count,
            int screen_ratio, int resolution, String ports){
    super(code,name,year,mnfc,price,store_count,screen_ratio,resolution,ports);
  }
}