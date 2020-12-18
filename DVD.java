public class DVD extends BlurayDVD {
    final static String type = "DVD";

    public DVD(){
    }

    public DVD(String code, String name, int year,
                      String mnfc, double price, int store_count,
                      int vid_resolution, String format){
      super(code,name,year,mnfc,price,store_count,vid_resolution,format);
      }
}