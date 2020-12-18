public class WashingMachine extends Item{
  private String energy_type;
  private double capacity;
  private int shift;

  public WashingMachine(){
  }

  public WashingMachine(String code, String name, int year,
                        String mnfc, double price,int store_count, String energy_type,
                        double capacity, int shift){
    super(code,name,year,mnfc,price,store_count);
    this.energy_type = energy_type;
    this.capacity = capacity;
    this.shift = shift;
  }
  public String getEnergy_type() { return energy_type; }
  public double getCapacity() { return capacity; }
  public int getShift() { return shift; }
  public void setEnergy_type(String newEnergy_type)
                      { energy_type = newEnergy_type; }
  public void setCapacity(double newCapacity)
                      { capacity = newCapacity; }
  public void setShift(int newShift) { shift = newShift; }

  public String toString(){
    return super.toString()+ "\nEnergy_class: "+getEnergy_type()
                           + "\nCapacity: "+getCapacity()
                           + "\nShift: "+getShift();
  }//toString
}//class WashingMachine
