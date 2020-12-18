public class TV extends Item{
  private int screen_ratio;
  private int resolution;
  private String ports;

  public TV(){
  }

  public TV(String code, String name, int year,
            String mnfc, double price, int store_count,
            int screen_ratio, int resolution, String ports){
    super(code,name,year,mnfc,price,store_count);
    this.screen_ratio = screen_ratio;
    this.resolution = resolution;
    this.ports = ports;
  }
  //get & set variables
  public int getScreen_ratio() { return screen_ratio; }
  public int getResolution() { return resolution; }
  public String getPorts() { return ports; }
  public void setScreen_ratio(int newScreen_ratio) {
                   screen_ratio = newScreen_ratio; }
  public void setResolution(int newResolution) {
                   resolution = newResolution; }
  public void setPorts(String newPorts) {
                   ports = newPorts; }

  public String toString(){
    return super.toString()
                           + "\nScreen ratio: "+getScreen_ratio()
                           + "\nResolution: "+getResolution()
                           + "\nAvailable ports: "+getPorts();
  }//toString
}//class TV
