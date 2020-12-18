import java.util.*; 
import java.io.*;

class ReadFileApp {

	public ArrayList <Item> DVD_list = new ArrayList <Item> ();
	public ArrayList <Item> Bluray_list = new ArrayList <Item> ();
	public ArrayList <Item> LCD_list = new ArrayList<Item>();
	public ArrayList <Item> LED_list = new ArrayList<Item>();
	public ArrayList <Item> Plasma_list = new ArrayList<Item>();
	public ArrayList <Item> Compact_list = new ArrayList<Item>();
	public ArrayList <Item> DSLR_list = new ArrayList<Item>();
	public ArrayList <Item> ActionCamera_list = new ArrayList<Item>();
	public ArrayList <Item> PS3_list = new ArrayList<Item>();
	public ArrayList <Item> PS4_list = new ArrayList<Item>();
	public ArrayList <Item> XBOX_list = new ArrayList<Item>();
	public ArrayList <Item> OneDoor_list = new ArrayList<Item>();
	public ArrayList <Item> TwoDoor_list = new ArrayList<Item>();
	public ArrayList <Item> ClosetStyle_list = new ArrayList<Item>();
	public ArrayList <Item> WAS_list = new ArrayList<Item>();

	public void ReadFile(){

		BufferedReader reader = null;
		Item product = null;
        String line;
		System.out.println("\n >>>>>>> Adding products to system...");
        try {
			reader = new BufferedReader(new FileReader(new File("OurProducts")));
              line = reader.readLine();
              while (line != null) {
                   if (line.trim().equals("ITEM_LIST")) 
                       line = reader.readLine();
                       if (line.trim().equals("{")) 
                           line = reader.readLine();
                          if (line.trim().equals("ITEM")) {
                              line = reader.readLine();
                              if (line.trim().equals("{")) {
                                  line = reader.readLine();
								if (line.trim().startsWith("MODEL_TYPE")){
                                  //LCD
                                  if (line.trim().substring(11).trim().equals("LCD")) {
                                      product = new LCD();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR ")) 
                                          product.setYear(Integer.parseInt(line.substring(18).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(13).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("SCREEN_RATIO "))
                                          ((LCD) product).setScreen_ratio(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("RESOLUTION "))
                                          ((LCD) product).setResolution(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PORTS "))
                                          ((LCD) product).setPorts(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(14).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          LCD_list.add(product);
                                  }//LCD
                                  //LED
                                  else if (line.trim().substring(11).trim().equals("LED")) {
                                      product = new LED();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("SCREEN_RATIO "))
                                          ((LED) product).setScreen_ratio(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("RESOLUTION "))
                                          ((LED) product).setResolution(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PORTS "))
                                          ((LED) product).setPorts(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          LED_list.add(product);
                                  }//LED
                                  //Plasma
                                  else if (line.trim().substring(11).trim().equals("Plasma")) {
                                      product = new Plasma();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("SCREEN_RATIO "))
                                          ((Plasma) product).setScreen_ratio(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("RESOLUTION "))
                                          ((Plasma) product).setResolution(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PORTS "))
                                          ((Plasma) product).setPorts(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          Plasma_list.add(product);
                                  }//Plasma
                                  //DSLR
                                  else if (line.trim().substring(11).trim().equals("DSLR")) {
                                      product = new DSLR();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("MEGAPIXELS "))
                                          ((DSLR) product).setMegapixel(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("OPTICAL_ZOOM "))
                                          ((DSLR) product).setZoom(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DIGITAL_ZOOM "))
                                          ((DSLR) product).setZoom_d(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("CAMERA_SCREEN "))
                                          ((DSLR) product).setCam_screen(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          DSLR_list.add(product);
                                  }//DsLR
                                  //Compact
                                  else if (line.trim().substring(11).trim().equals("Compact")) {
                                      product = new Compact();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("MEGAPIXELS "))
                                          ((Compact) product).setMegapixel(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("OPTICAL_ZOOM "))
                                          ((Compact) product).setZoom(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DIGITAL_ZOOM "))
                                          ((Compact) product).setZoom_d(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("CAMERA_SCREEN "))
                                          ((Compact) product).setCam_screen(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          Compact_list.add(product);
                                  }//Compact
                                  //ActionCamera
                                  else if (line.trim().substring(11).trim().equals("Action Camera")) {
                                      product = new ActionCamera();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("MEGAPIXELS "))
                                          ((ActionCamera) product).setMegapixel(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("OPTICAL_ZOOM "))
                                          ((ActionCamera) product).setZoom(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DIGITAL_ZOOM "))
                                          ((ActionCamera) product).setZoom_d(Integer.parseInt(line.substring(13+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("CAMERA_SCREEN "))
                                          ((ActionCamera) product).setCam_screen(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          ActionCamera_list.add(product);
                                  }//ActionCamera
                                  //DVD
                                  else if (line.trim().substring(11).trim().equals("DVD")) {
                                      product = new DVD();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();


                                      if (line.trim().startsWith("VIDEO_RESOLUTION "))
                                          ((DVD) product).setVid_resolution(Integer.parseInt(line.substring(17+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("FORMAT "))
                                          ((DVD) product).setFormat(line.trim().substring(7).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          DVD_list.add(product);
                                  }//DVD
                                  //Bluray
                                  else if (line.trim().substring(11).trim().equals("Bluray")) {
                                      product = new Bluray();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("VIDEO_RESOLUTION "))
                                          ((Bluray) product).setVid_resolution(Integer.parseInt(line.substring(17+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("FORMAT "))
                                          ((Bluray) product).setFormat(line.trim().substring(7).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          Bluray_list.add(product);
                                  }//Bluray
                                  //ps3
                                  else if (line.trim().substring(11).trim().equals("PS3")) {
                                      product = new PS3();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CPU "))
                                          ((PS3) product).setCpu(line.trim().substring(4).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("GRAPHICS "))
                                          ((PS3) product).setGraphics(line.trim().substring(9).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("SOUND "))
                                          ((PS3) product).setSound(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DISK_CAPACITY "))
                                          ((PS3) product).setDisk(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          PS3_list.add(product);
                                  }//PS3
                                  //ps4
                                  else if (line.trim().substring(11).trim().equals("PS4")) {
                                      product = new PS4();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CPU "))
                                          ((PS4) product).setCpu(line.trim().substring(4).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("GRAPHICS "))
                                          ((PS4) product).setGraphics(line.trim().substring(9).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("SOUND "))
                                          ((PS4) product).setSound(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DISK_CAPACITY "))
                                          ((PS4) product).setDisk(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          PS4_list.add(product);
                                  }//PS4
                                  //xbox
                                  else if (line.trim().substring(11).trim().equals("XBOX")) {
                                      product = new XBOX();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CPU "))
                                          ((XBOX) product).setCpu(line.trim().substring(4).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("GRAPHICS "))
                                          ((XBOX) product).setGraphics(line.trim().substring(9).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("SOUND "))
                                          ((XBOX) product).setSound(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("DISK_CAPACITY "))
                                          ((XBOX) product).setDisk(Integer.parseInt(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          XBOX_list.add(product);
                                  }//XBOX
                                  //OneDoor
                                  else if (line.trim().substring(11).trim().equals("One Door")) {
                                      product = new OneDoor();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("ENERGY_CLASS "))
                                          ((OneDoor) product).setEnergy_class(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MAIN_CAPACITY "))
                                          ((OneDoor) product).setMain_capacity(Double.parseDouble(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("FROST_CAPACITY "))
                                          ((OneDoor) product).setFrost_capacity(Double.parseDouble(line.substring(15+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          OneDoor_list.add(product);
                                  }//OneDoor
                                  //twoDoor
                                  else if (line.trim().substring(11).trim().equals("Two Door")) {
                                      product = new TwoDoor();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("ENERGY_CLASS "))
                                          ((TwoDoor) product).setEnergy_class(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MAIN_CAPACITY "))
                                          ((TwoDoor) product).setMain_capacity(Double.parseDouble(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("FROST_CAPACITY "))
                                          ((TwoDoor) product).setFrost_capacity(Double.parseDouble(line.substring(15+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          TwoDoor_list.add(product);
                                  }//TwoDoor
                                  //closetStyle
                                  else if (line.trim().substring(11).trim().equals("Closet Style")) {
                                      product = new ClosetStyle();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("ENERGY_CLASS "))
                                          ((ClosetStyle) product).setEnergy_class(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MAIN_CAPACITY "))
                                          ((ClosetStyle) product).setMain_capacity(Double.parseDouble(line.substring(14+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("FROST_CAPACITY "))
                                          ((ClosetStyle) product).setFrost_capacity(Double.parseDouble(line.substring(15+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          ClosetStyle_list.add(product);
                                  }//ClosetStyle
                                  //washing machine
                                  else if (line.trim().substring(11).trim().equals("Washing Machine")) {
                                      product = new WashingMachine();
                                      line = reader.readLine();

                                      if (line.trim().startsWith("CODE "))
                                          product.setCode(line.trim().substring(5).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL "))
                                          product.setName(line.trim().substring(6).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MODEL_YEAR "))
                                          product.setYear(Integer.parseInt(line.substring(11+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("MANUFACTURER "))
                                          product.setMnfc(line.trim().substring(13).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PRICE "))
                                          product.setPrice(Double.parseDouble(line.substring(6+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().startsWith("ENERGY_CLASS "))
                                          ((WashingMachine) product).setEnergy_type(line.trim().substring(12).trim());
                                      line = reader.readLine();
                                      if (line.trim().startsWith("CAPACITY "))
                                          ((WashingMachine) product).setCapacity(Double.parseDouble(line.substring(9+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("SHIFT "))
                                          ((WashingMachine) product).setShift(Integer.parseInt(line.substring(6+7).trim()));
                                      line = reader.readLine();
                                      if (line.trim().startsWith("PIECES "))
                                          product.setStoreCount(Integer.parseInt(line.substring(7+7).trim()));
                                      line = reader.readLine();

                                      if (line.trim().equals("}"))
                                          WAS_list.add(product);
                                  }//WashingMachine
					            }//modeltype
                              }//2nd {
                          }//ITEM
              line = reader.readLine();
            }//while
              reader.close();
        }//try
              catch (IOException e) {
                  System.out.println	("Error reading line ...");
    		      }
  }//readFile

	// gia dokimh an douleuei swsta..
	// public void PrintList (){
	//	System.out.println("\n >>>>>>> Printing List... \n");
	//	for (Item product:LCD_list)
	//		System.out.println(product);
	//} // PrintList
	
	//public static void main(String[] args) {
	//	ReadFileApp app = new ReadFileApp ();
	//	app.ReadFile();
	//	app.PrintList();
	//}//main

}//class
