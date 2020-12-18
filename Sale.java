public class Sale{

  private Item item;
  private int sale_ID;
  static int last_sale_ID = 0;
  private String costumer;
  private String sell_date;
  private double cost;

  public Sale(Item item){
    this.item = item;
    item.setStoreCount(item.getStoreCount() - 1);
    this.sale_ID = last_sale_ID + 1;
    last_sale_ID = last_sale_ID + 1;
  }

  public Item getItem() { return item; }
  public int getSaleID() { return sale_ID; }
  public String getCostumer() { return costumer; }
  public String getDate() { return sell_date; }
  public double getCost() { return cost; }
  public void setItem(Item newItem) { item = newItem; }
  public void setCostumer(String newCostumer) { costumer = newCostumer; }
  public void setSellDate(String newSellDate) { sell_date = newSellDate; }
  public void setCost(double newCost) { cost = newCost; }

  public String toString(){
    return "\nSALE INFO:\n "+ item.toString()
                        + "\nSale ID: "+sale_ID + "\nCostumer: "+costumer
                         + "\nSell Date: "+sell_date
                         + "\nPrice paid: "+cost +"\n";
  }
}
