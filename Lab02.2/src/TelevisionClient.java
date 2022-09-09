public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);

     tv1.turnOn();
     tv1.turnOff();
    System.out.println(tv1.toString());
    System.out.println(tv1);

    System.out.printf("%d television instances created%n",Television.getInstanceCount());

    Television tv2 = new Television("Lenovo", 30);
//     tv2.setBrand("Lenovo");
//     tv2.setVolume(30);
     tv2.turnOn();
     tv2.turnOff();
    System.out.println(tv2);
    System.out.printf("%d television instances created%n",Television.getInstanceCount());


//     tv3.turnOn();
//     tv3.turnOff();
    Television tv3 = new Television("LG");
    System.out.println(tv3);
//    System.out.println(new Television("LG")); //same as line 26+27
    System.out.printf("%d television instances created%n",Television.getInstanceCount());


    Television tv4 = new Television("Sony", 40);
    System.out.println(tv4);

    Television tv5 = new Television("Sony", 40, DisplayType.PLASMA);
    System.out.println(tv5);






  }

}
