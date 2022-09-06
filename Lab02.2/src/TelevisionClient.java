public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(25);

    Television tv2 = new Television();
     tv2.setBrand("Lenovo");
     tv2.setVolume(30);

     tv1.turnOn();
     tv1.turnOff();

     tv2.turnOn();
     tv2.turnOff();

    System.out.println(tv1.toString());
    System.out.println(tv1);

  }

}
