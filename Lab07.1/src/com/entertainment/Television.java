package com.entertainment;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;

  private  String brand;
  private int volume;
  private DisplayType display = DisplayType.LED;


  public Television(){
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);
  }

  public void turnOn(){
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff(){
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    switch(brand){
      case "Samsung":
      case "LG":
      case "Sony":
      case "Toshiba":
        this.brand = brand;
        break;
      default:
        System.out.printf("%s is invalid; only Samsung, LG, Sony and Toshiba are allowed.%n",brand);
    }

  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume >MAX_VOLUME){
      //%d is a placeholder for base 10 representation of integer value, here volume, MIN_VOLUME and MAX_VOLUME; $n for new line
      System.out.printf("%d is invalid; volume must between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME);

    }else {
      this.volume = volume;
    }
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "com.entertainment.Television: brand = " + brand + ", volume = " + volume + ", display type = " + display;
  }
}
