public class Item{

  private String code;
  private String name;
  private int year;
  private String mnfc;     //manufacturer
  private double price;
  private int store_count;   //posa temaxia exw sto magazi

  public Item(){
  }

  public Item(String code, String name, int year,
              String mnfc, double price, int store_count){
    this.code = code;
    this.name = name;
    this.year = year;
    this.mnfc = mnfc;
    this.price = price;
    this.store_count = store_count;
  }
  // get & set variables
  public String getCode() { return code; }
  public String getName() { return name; }
  public int getYear() { return year; }
  public String getMnfc() { return mnfc; }
  public double getPrice() { return price; }
  public int getStoreCount() { return store_count; }

  public void setCode(String newCode) { code = newCode; }
  public void setName(String newName) { name = newName; }
  public void setYear(int newYear) { year = newYear; }
  public void setMnfc(String newMnfc) { mnfc = newMnfc; }
  public void setPrice(double newPrice) { price = newPrice; }
  public void setStoreCount(int newStore_count) { store_count = newStore_count; }


  public String toString(){
    return "\nProduct Name: "+getName()
            + "\nID: "+getCode()
            + "\nYear of production: "+getYear()
            + "\nManufacturer: "+getMnfc()
            + "\nPrice: "+getPrice()
            + "\nStock: "+getStoreCount();
  }//toString
}// class Item