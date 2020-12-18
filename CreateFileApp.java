import java.util.*;
import java.io.*;

class CreateFileApp {

	public ArrayList <Sale> sales = new ArrayList<Sale>();
	public ArrayList <Order> orders = new ArrayList<Order>();

  public void CreateSaleFile () {
	  
      mainApp2 sl = new mainApp2();
      
	  ArrayList <Sale> sales = sl.sales;

      System.out.println("\n>>>>>>> Writing data from SALES_LIST to FILE...");
      FileWriter writer = null;

      try	{
        writer = new FileWriter(new File("Sales.txt"));
        writer.write("SALE_LIST"+"\n"+"{"+"\n");
        
        for (Sale product:sales)
          if (product.getItem() instanceof BlurayDVD) {
              writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " Video"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"DATE " + product.getDate()
                + "\n"+"\t"+"}"+"\n");
          }//BluerayDVD
          else if (product.getItem() instanceof TV) {
              writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " TV"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"DATE " + product.getDate()
                + "\n"+"\t"+"}"+"\n");
         }//tv
          else if (product.getItem() instanceof Camera) {
              writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " Camera"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"DATE " + product.getDate()
                + "\n"+"\t"+"}"+"\n");
         }//camera
          else if (product.getItem() instanceof Console) {
              writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " Video"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"DATE " + product.getDate()
                + "\n"+"\t"+"}"+"\n");
          }//console
        else if (product.getItem() instanceof Fridge) {
            writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
              + "\n"+"\t"+"ITEM_TYPE " + " Refrigeretor"
              + "\n"+"\t"+"MODEL "+ product.getItem().getName()
              + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
              + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
              + "\n"+"\t"+"NAME "	+ product.getCostumer()
              + "\n"+"\t"+"DATE " + product.getDate()
              + "\n"+"\t"+"}"+"\n");
        }//fridge
        else if (product.getItem() instanceof WashingMachine) {
            writer.write ("\t"+ "SALE"+"\n"+"\t"+"{"
              + "\n"+"\t"+"ITEM_TYPE " + " Washing Machine"
              + "\n"+"\t"+"MODEL "+ product.getItem().getName()
              + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
              + "\n"+"\t"+"SALES_NUMBER "	+ product.getSaleID()
              + "\n"+"\t"+"NAME "	+ product.getCostumer()
              + "\n"+"\t"+"DATE " + product.getDate()
              + "\n"+"\t"+"}"+"\n");
        }//WashingMachine
          writer.write("}");
          writer.close();
      }//try
      catch (IOException e) {
          System.out.println	("Error creating file ...");
	  }
    }//createSALEfile

    public void CreateOrderFile () {

        mainApp2 or = new mainApp2();
  	    ArrayList <Order> orders = or.orders;
  	    
        System.out.println("\n>>>>>>> Writing data from ORDER_LIST to FILE...");
        FileWriter writer = null;

        try	{
          writer = new FileWriter(new File("Order.txt"));
          writer.write("ORDER_LIST"+"\n"+"{"+"\n");
          
          for (Order product:orders)
            if (product.getItem() instanceof BlurayDVD) {
              writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                  + "\n"+"\t"+"ITEM_TYPE " + " Video"
                  + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                  + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                  + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                  + "\n"+"\t"+"NAME "	+ product.getCostumer()
                  + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                  + "\n"+"\t"+"PRICE " + product.getCost()
                  + "\n"+"\t"+"STATUS " + "AWAITING"
                  + "\n"+"\t"+"}"+"\n");
            }//BluerayDVD
            else if (product.getItem() instanceof TV) {
                writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                  + "\n"+"\t"+"ITEM_TYPE " + " TV"
                  + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                  + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                  + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                  + "\n"+"\t"+"NAME "	+ product.getCostumer()
                  + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                  + "\n"+"\t"+"PRICE " + product.getCost()
                  + "\n"+"\t"+"STATUS " + "AWAITING"
                  + "\n"+"\t"+"}"+"\n");
           }//tv
            else if (product.getItem() instanceof Camera) {
                writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                  + "\n"+"\t"+"ITEM_TYPE " + " Camera"
                  + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                  + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                  + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                  + "\n"+"\t"+"NAME "	+ product.getCostumer()
                  + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                  + "\n"+"\t"+"PRICE " + product.getCost()
                  + "\n"+"\t"+"STATUS " + "AWAITING"
                  + "\n"+"\t"+"}"+"\n");
           }//camera
            else if (product.getItem() instanceof Console) {
                writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                  + "\n"+"\t"+"ITEM_TYPE " + " Console"
                  + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                  + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                  + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                  + "\n"+"\t"+"NAME "	+ product.getCostumer()
                  + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                  + "\n"+"\t"+"PRICE " + product.getCost()
                  + "\n"+"\t"+"STATUS " + "AWAITING"
                  + "\n"+"\t"+"}"+"\n");
            }//console
          else if (product.getItem() instanceof Fridge) {
              writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " Fridge"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                + "\n"+"\t"+"PRICE " + product.getCost()
                + "\n"+"\t"+"STATUS " + "AWAITING"
                + "\n"+"\t"+"}"+"\n");
          }//fridge
          else if (product.getItem() instanceof WashingMachine) {
              writer.write ("\t"+ "ORDER"+"\n"+"\t"+"{"
                + "\n"+"\t"+"ITEM_TYPE " + " Washing Machine"
                + "\n"+"\t"+"MODEL "+ product.getItem().getName()
                + "\n"+"\t"+"MANUFACTURER "+ product.getItem().getMnfc()
                + "\n"+"\t"+"ORDER_NUMBER "	+ product.getOrderID()
                + "\n"+"\t"+"NAME "	+ product.getCostumer()
                + "\n"+"\t"+"ORDER_DATE " + product.getDate()
                + "\n"+"\t"+"PRICE " + product.getCost()
                + "\n"+"\t"+"STATUS " + "AWAITING"
                + "\n"+"\t"+"}"+"\n");
          }//WashingMachine
            writer.write("}");
            writer.close();
        }//try
        catch (IOException e) {
            System.out.println	("Error creating file ...");
  	    }
      }//createORDERfile
}//class