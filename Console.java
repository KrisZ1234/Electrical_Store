public class Console extends Item{
  private String cpu;
  private String graphics;
  private String sound;
  private int disk;      //disk capacity

  public Console(){
  }

  public Console(String code, String name, int year,
                  String mnfc, double price, int store_count, String cpu,
                  String graphics, String sound, int disk){
    super(code,name,year,mnfc,price,store_count);
    this.cpu = cpu;
    this.graphics = graphics;
    this.sound = sound;
    this.disk = disk;
  }
  //get & set variables
  public String getCpu() { return cpu; }
  public String getGraphics() { return graphics; }
  public String getSound() { return sound; }
  public int getDisk() { return disk; }
  public void setCpu(String newCpu) { cpu = newCpu; }
  public void setGraphics(String newGraphics) { graphics = newGraphics; }
  public void setSound(String newSound) { sound = newSound; }
  public void setDisk(int newDisk) { disk = newDisk; }

  public String toString(){

    return super.toString()+ "\nCPU: "+getCpu()
                           + "\nGraphic card: "+getGraphics()
                           + "\nSound card: "+getSound()
                           + "\nDisk capacity: "+getDisk();
  }//toString
}//class Console
