public class Order{

  private Item item;
  private int order_ID;
  static int last_order_ID;
  private String costumer;
  private String order_date;
  private double cost;
  private String status;      //order status

  public Order(Item item){
    this.item = item;
    this.order_ID = last_order_ID + 1;
    last_order_ID = last_order_ID + 1;
    
  }
  
  public Item getItem() { return item; }
  public int getOrderID() { return order_ID; }
  public String getCostumer() { return costumer; }
  public String getDate() { return order_date; }
  public double getCost(){ return cost; }
  public void setStatus(String newStatus) { status = newStatus; }
  public void setCostumer(String newCostumer) { costumer = newCostumer; }
  public void setOrderDate(String newOrderDate) { order_date = newOrderDate; }
  public void setNewCost(double newCost) { cost = newCost; }
  public void setCost(double newCost) { cost = newCost; }

  public String toString(){
    return "\nORDER INFO:\n "+ item.toString()
                         + "\nOrder ID: "+order_ID + "\nCostumer: "+costumer
                         + "\nOrder Date: "+order_date
                         + "\nPrice after discount: "+cost + "\nOrder Status: "+status +"\n";
  }
}
