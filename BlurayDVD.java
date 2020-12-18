public class BlurayDVD extends Item{
  private int vid_resolution;
  private String format;

  public BlurayDVD(){
  }
  
  public BlurayDVD(String code, String name, int year,
                    String mnfc, double price, int store_count,
                    int vid_resolution, String format){
    super(code,name,year,mnfc,price,store_count);
    this.vid_resolution = vid_resolution;
    this.format = format;
  }
  //get & set variables
  public int getVid_resolution() { return vid_resolution; }
  public String getFormat() { return format; }
  public void setVid_resolution(int newVid_resolution) {
                       vid_resolution = newVid_resolution; }
  public void setFormat(String newFormat) {
                       format = newFormat; }

  public String toString(){
    return super.toString() + "\nResolution: "+getVid_resolution()
                            + "\nFormat: "+getFormat();
  }//toString
}//class BlurayDVD