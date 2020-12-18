public class Fridge extends Item{
  private String energy_class;
  private double main_capacity;    //maintance
  private double frost_capacity;

  public Fridge(){
  }

  public Fridge(String code, String name, int year,
                String mnfc, double price,int store_count,
                String energy_class, double main_capacity,
                double frost_capacity){
    super(code,name,year,mnfc,price,store_count);
    this.energy_class = energy_class;
    this.main_capacity = main_capacity;
    this.frost_capacity = frost_capacity;
  }
  //get&set variables
  public String getEnergy_class() { return energy_class; }
  public double getMain_capacity() { return main_capacity; }
  public double getFrost_capacity() { return frost_capacity; }
  public void setEnergy_class(String newEnergy_class)
                      { energy_class = newEnergy_class; }
  public void setMain_capacity(double newMain_capacity)
                      { main_capacity = newMain_capacity; }
  public void setFrost_capacity(double newFrost_capacity)
                      { frost_capacity = newFrost_capacity; }

  public String toString(){

    return super.toString()+ "\nEnergy Class: "+getEnergy_class()
                           + "\nMaintance capacity: "+getMain_capacity()
                           + "\nFrost capacity: "+getFrost_capacity();
  }//toString
}//class fridge
