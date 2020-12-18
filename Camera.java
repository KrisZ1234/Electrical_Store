public class Camera extends Item{
  private int megapixel;
  private int zoom;        // optical zoom
  private int zoom_d;      //digital zool
  private int cam_screen;

  public Camera(){
  }

  public Camera(String code, String name, int year,
                String mnfc, double price,int store_count,
                int megapixel, int zoom, int zoom_d,
                int cam_screen){
    super(code,name,year,mnfc,price,store_count);
    this.megapixel = megapixel;
    this.zoom = zoom;
    this.zoom_d = zoom_d;
    this.cam_screen = cam_screen;
  }
  //get & set variables
  public int getMegapixel() { return megapixel; }
  public int getZoom() { return zoom; }
  public int getZoom_d() { return zoom_d; }
  public int getCam_screen() { return cam_screen; }
  public void setMegapixel(int newMegapixel) { megapixel = newMegapixel; }
  public void setZoom(int newZoom) { zoom = newZoom; }
  public void setZoom_d(int newZoom_d) { zoom_d = newZoom_d; }
  public void setCam_screen(int newCam_screen) {
                   cam_screen = newCam_screen; }

  public String toString(){
    return super.toString()+ "\nMegapixels: "+getMegapixel()
                           + "\nMax zoom: "+getZoom()
                           + "\nDigital zoom: "+getZoom_d()
                           + "\nScreen ratio: "+getCam_screen();
  }//toString
}//class Camera