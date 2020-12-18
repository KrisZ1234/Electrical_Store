import java.util.*;

public class mainApp2{
	
    //dhmiourgia twn katalogwn sale/order ws metavlhtes ths main
    public static ArrayList <Sale> sales = new ArrayList <Sale> ();
    public static ArrayList <Order> orders = new ArrayList <Order> ();

    public static void main(String args[]){
    //dhmiourgia voh8htikhs listas gia tis epiloges tou xrhsth
        ArrayList <Item> list_wanted = new ArrayList <Item> ();
    //fortosh proiontwn katasthmatos apo to arxeio products.txt
        ReadFileApp rfa = new ReadFileApp();
        rfa.ReadFile();
        
        ArrayList <Item> DVD_list = rfa.DVD_list;
        ArrayList <Item> Bluray_list = rfa.Bluray_list;
        ArrayList <Item> LCD_list = rfa.LCD_list;
        ArrayList <Item> LED_list = rfa.LED_list;
        ArrayList <Item> Plasma_list = rfa.Plasma_list;
        ArrayList <Item> Compact_list = rfa.Compact_list;
        ArrayList <Item> ActionCamera_list = rfa.ActionCamera_list;
        ArrayList <Item> DSLR_list = rfa.DSLR_list;
        ArrayList <Item> PS3_list = rfa.PS3_list;
        ArrayList <Item> PS4_list = rfa.PS4_list;
        ArrayList <Item> XBOX_list = rfa.XBOX_list;
        ArrayList <Item> OneDoor_list = rfa.OneDoor_list;
        ArrayList <Item> TwoDoor_list = rfa.TwoDoor_list;
        ArrayList <Item> ClosetStyle_list = rfa.ClosetStyle_list;
        ArrayList <Item> WAS_list = rfa.WAS_list;

        Scanner in = new Scanner(System.in);
        boolean done = false;
        int answer, choice;
        String purchaseMenu = "\n------------------: "
                + "\nWhich product would you like to purchase? "
                + "\nYour option(number): "
                + "\n-->: ";

        while ( !done ){
             System.out.println("\n-------------------------------"
                              + "\n0. View available products.."
                              + "\n1. View order list.."
                              + "\n2. View saled products.."
                              + "\n3. Exit shop.."
                              + "\n-------------------------------"
                              + "\nYour option(number)> ");
             answer = in.nextInt();
           //0.Available list
             if (answer == 0){
                 System.out.println("\n----choose category----"
                                  + "\n0. Picture & Sound.."
                                  + "\n1. Gaming.."
                                  + "\n2. Appliances.."
                                  + "\n-------------------------------"
                                  + "\nYour option(number): ");
                 answer = in.nextInt();
                 //00. Picture&Sound
                   if (answer == 0){
                       System.out.println("\n---Picture & Sound---"
                                        + "\n0. TVs.."
                                        + "\n1. Bluray & DVD.."
                                        + "\n2. Camera.."
                                        + "\n-------------------------------"
                                        + "\nYour option(number): ");
                       answer = in.nextInt();
                       //000. Tvs
                        if (answer == 0){
                            System.out.println("\n---TV---"
                                             + "\n0. LCD.."
                                             + "\n1. LED.."
                                             + "\n2. Plasma.."
                                             + "\n--------------------------"
                                             + "\nYour option(number): ");
                            answer = in.nextInt();

                            if (answer == 0){
                                list_wanted = LCD_list;
                            }
                            else if (answer == 1) {
                                list_wanted = LED_list;
                            }
                            else if (answer == 2) {
                                list_wanted = Plasma_list;
                            }
                            int i = 0;
                            for (Item x : list_wanted ) {
                                System.out.print("\n\n----> "+ i
                                                 + x.toString()
                                                 +"\nPrice after discount: "
                                                 + x.getPrice()*(1-0.25));
                                i++;
                            }
                            System.out.println(purchaseMenu);
                            choice = in.nextInt();
                            makeChoice(list_wanted.get(choice));

                        }//tvs
                        //001. Bluray&DvD
                        else if (answer == 1){
                            System.out.println("\n---Bluray & DVD---"
                                             + "\n0. Bluray.."
                                             + "\n1. DVD.."
                                             + "\n---------------------------"
                                             + "\nYour option(number): ");
                            answer = in.nextInt();

                            if (answer == 0){
                                list_wanted = Bluray_list;
                            }
                            else if (answer == 1) {
                                list_wanted = DVD_list;
                            }
                            int i = 0;
                            for (Item x : list_wanted ) {
                                System.out.print("\n\n----> "+ i
                                                 + x.toString()
                                                 +"\nPrice after discount: "
                                                 + x.getPrice()*(1-0.25));
                                i++;
                            }
                            System.out.println(purchaseMenu);
                            choice = in.nextInt();
                            makeChoice(list_wanted.get(choice));

                        }//Bluraydvd
                        //002. cameras
                        else if (answer == 2){
                            System.out.println("\n---Cameras---"
                                             + "\n0. Compact.."
                                             + "\n1. DSLR.."
                                             + "\n2. Action camera.."
                                             + "\n---------------------------"
                                             + "\nYour option(number): ");
                            answer = in.nextInt();

                            if (answer == 0){
                                list_wanted = Compact_list;
                            }
                            else if (answer == 1) {
                                list_wanted = DSLR_list;
                            }
                            else if (answer == 2) {
                                list_wanted = ActionCamera_list;
                            }
                            int i = 0;
                            for (Item x : list_wanted ) {
                                System.out.print("\n\n----> "+ i
                                                 + x.toString()
                                                 +"\nPrice after discount: "
                                                 + x.getPrice()*(1-0.25));
                                i++;
                            }
                            System.out.println(purchaseMenu);
                            choice = in.nextInt();
                            makeChoice(list_wanted.get(choice));

                        }//cameras
                   }//Picture and sound
                   //01. Gaming
                   else if (answer == 1){
                       System.out.println("\n---Gaming---"
                                        + "\n0. PS3.."
                                        + "\n1. PS4.."
                                        + "\n2. Xbox.."
                                        + "\n---------------------------"
                                        + "\nYour option(number): ");
                       answer = in.nextInt();

                       if (answer == 0){
                           list_wanted = PS3_list;
                       }
                       else if (answer == 1) {
                           list_wanted = PS4_list;
                       }
                       else if (answer == 2) {
                           list_wanted = XBOX_list;
                       }
                       int i = 0;
                       for (Item x : list_wanted ) {
                           System.out.print("\n\n----> "+ i
                                            + x.toString()
                                            +"\nPrice after discount: "
                                            + x.getPrice()*(1-0.10));
                           i++;
                       }
                       System.out.println(purchaseMenu);
                       choice = in.nextInt();
                       makeChoice(list_wanted.get(choice));

                   }//gaming
                   //02. Appliances
                   else if (answer == 2){
                       System.out.println("\n---Appliances---"
                                        + "\n0. Fridges.."
                                        + "\n1. Washing Machines.."
                                        + "\n-------------------------------"
                                        + "\nYour option(number): ");
                       answer = in.nextInt();
                       //020. fridges
                       if (answer == 0){
                           System.out.println("\n---Fridges---"
                                            + "\n0. one-door.."
                                            + "\n1. two-doors.."
                                            + "\n2. closet-style.."
                                            + "\n-------------------------------"
                                            + "\nYour option(number): ");
                           answer = in.nextInt();

                           if (answer == 0){
                               list_wanted = OneDoor_list;
                           }
                           else if (answer == 1) {
                               list_wanted = TwoDoor_list;
                           }
                           else if (answer == 2) {
                               list_wanted = ClosetStyle_list;
                           }
                           int i = 0;
                           for (Item x : list_wanted ) {
                               System.out.print("\n----> "+ i
                                                + x.toString()
                                                +"\nPrice after discount: "
                                                + x.getPrice()*(1-0.20));
                               i++;
                           }
                           System.out.println(purchaseMenu);
                           choice = in.nextInt();
                           makeChoice(list_wanted.get(choice));

                      }//fridges
                      //021. washing Machines
                      else if (answer == 1){
                        int i = 0;
                        for (Item x : WAS_list ) {
                            System.out.print("\n\n----> "+ i
                                             + x.toString()
                                             +"\nPrice after discount: "
                                             + x.getPrice()*(1-0.20));
                            i++;
                        }
                        System.out.println(purchaseMenu);
                        choice = in.nextInt();
                        makeChoice(list_wanted.get(choice));

                      }//washingmachine
                   }//appliances
             }//Available
             //view order list
             else if (answer == 1){
                 Iterator<Order> itr = orders.iterator();
                 while(itr.hasNext()){ System.out.print(itr.next());}
             }
             //view sale list
             else if (answer == 2){
                 Iterator<Sale> itr = sales.iterator();
                 while(itr.hasNext()){ System.out.print(itr.next());}
             }//sale list
             //exit
             else if (answer == 3){
            	  //gia na metaferei tis agores/paraggelies pou kaname se arxeia txt
                  CreateFileApp cfp = new CreateFileApp();
                  cfp.CreateOrderFile();
                  cfp.CreateSaleFile();
                  //kleisimo programmatos
                  System.out.println("Closing programm..");
                  in.close();
                  done = true;
             }
        }//while
        //in.close();
   }//main
    
   public static void makeChoice(Item x){
        Scanner in = new Scanner(System.in);
        int YN_answer;
        if (x.getStoreCount() <= 0){
            System.out.println("\nProduct not available.. ");
            System.out.println("\nWant to order it? ( Yes = 1 / No = 0 )");
            YN_answer = in.nextInt();
                if (YN_answer == 1) {
                    orders.add(makeOrder(x));
                }
        }
        else if (x.getStoreCount() > 0){
            System.out.println("\nProduct is available.. ");
            System.out.println("\nWant to purchase it? ( Yes = 1 / No = 0 )");
            YN_answer = in.nextInt();
                if (YN_answer == 1) {
                    sales.add(makeSale(x));
                }
        }
   }//makeChoice

   public static Sale makeSale(Item chosen){
      Scanner in = new Scanner(System.in);
      String name, date;

      Sale newSale = new Sale(chosen);

      System.out.println("\nPurchasing item..");
      System.out.println("\nInsert your name? ");
      name = in.nextLine();
      newSale.setCostumer(name);

      System.out.println("\nInsert the date of payment? ");
      date = in.nextLine();
      newSale.setSellDate(date);

      System.out.println("\nCost after discount ");
      if ((chosen instanceof BlurayDVD)||(chosen instanceof TV)||(chosen instanceof Camera)) {
          newSale.setCost(chosen.getPrice()*(1-0.25));
          System.out.print(newSale.getCost());
      }
      else if (chosen instanceof Console){
          newSale.setCost(chosen.getPrice()*(1-0.1));
          System.out.print(newSale.getCost());
      }
      else if ((chosen instanceof Fridge)||(chosen instanceof WashingMachine)){
          newSale.setCost(chosen.getPrice()*(1-0.2));
          System.out.print(newSale.getCost());
      }
      //in.close();
      System.out.println("\nSALE COMPLETED ");
      return newSale;
      
   }//makeSale

   public static Order makeOrder(Item chosen){
      Scanner in = new Scanner(System.in);
      String name, date;

      Order newOrder = new Order(chosen);

      System.out.println("\nOrdering item..");
      System.out.println("\nInsert your name? ");
      name = in.nextLine();
      newOrder.setCostumer(name);

      System.out.println("\nInsert date of order? ");
      date = in.nextLine();
      newOrder.setOrderDate(date);

      System.out.println("\nCost after discount ");
      if ((chosen instanceof BlurayDVD)||(chosen instanceof TV)||(chosen instanceof Camera)) {
         newOrder.setCost(chosen.getPrice()*(1-0.25));
         System.out.print(newOrder.getCost());
      }
      else if (chosen instanceof Console){
         newOrder.setCost(chosen.getPrice()*(1-0.1));
         System.out.print(newOrder.getCost());
      }
      else if ((chosen instanceof Fridge)||(chosen instanceof WashingMachine)){
         newOrder.setCost(chosen.getPrice()*(1-0.2));
         System.out.print(newOrder.getCost());
      }
      newOrder.setStatus("EXPECTED..");
      System.out.println("\nORDER COMPLETED ");
      //in.close();
      return newOrder;
      
   }//makeOrder
   
}//class