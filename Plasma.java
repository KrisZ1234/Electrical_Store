public class Plasma extends TV {
  final static String type = "Plasma";

  public Plasma(){
  }

  public Plasma(String code, String name, int year,
            String mnfc, double price, int store_count,
            int screen_ratio, int resolution, String ports){
    super(code,name,year,mnfc,price,store_count,screen_ratio,resolution,ports);
  }
}