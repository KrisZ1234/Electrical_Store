public class DSLR extends Camera {
  final static String type = "DSLR";

  public DSLR(){
  }
  
  public DSLR(String code, String name, int year,
              String mnfc, double price,int store_count,
              int megapixel, int zoom, int zoom_d,
              int cam_screen){
      super(code,name,year,mnfc,price,store_count,megapixel,zoom,zoom_d,cam_screen);
  }
}
