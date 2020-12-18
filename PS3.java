public class PS3 extends Console {
  final static String type = "ps3";

  public PS3(){
  }

  public PS3(String code, String name, int year,
                  String mnfc, double price, int store_count, String cpu,
                  String graphics, String sound, int disk){
    super(code,name,year,mnfc,price,store_count,cpu,graphics,sound,disk);
  }
}