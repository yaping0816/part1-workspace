public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = "Samsung";
    tv1.volume = 25;

    Television tv2 = new Television();
     tv2.brand = "Lenovo";
     tv2.volume = 30;

     tv1.turnOn();
     tv1.turnOff();

     tv2.turnOn();
     tv2.turnOff();

  }

}
