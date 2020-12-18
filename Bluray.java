public class Bluray extends BlurayDVD {
    final static String type = "Blu-ray";

    public Bluray(){
    }

    public Bluray(String code, String name, int year,
                      String mnfc, double price, int store_count,
                      int vid_resolution, String format){
      super(code,name,year,mnfc,price,store_count,vid_resolution,format);
    }
}