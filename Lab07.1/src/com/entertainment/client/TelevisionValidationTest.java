package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tvTester1 = new Television();
    tvTester1.setVolume(10);
//    tvTester1.getVolume();
    System.out.println(tvTester1);

    tvTester1.setVolume(110);
//    tvTester1.getVolume();
    System.out.println(tvTester1);

    tvTester1.setVolume(-110);
//    tvTester1.getVolume();
    System.out.println(tvTester1);

    tvTester1.setBrand("LG");
    System.out.println(tvTester1);

    tvTester1.setBrand("Levono");
    System.out.println(tvTester1);

    tvTester1.setBrand("samsung");
    System.out.println(tvTester1);

    tvTester1.setBrand("toto");
    System.out.println(tvTester1);



  }

}
