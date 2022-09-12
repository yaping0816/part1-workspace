package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

/**
 * Intended usage (by human):
 *  $ java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.entertainment.Television with the specifications (values) provided by the user.
 */
public class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2]);

        Television tv = new Television(brand, volume, display);
        System.out.println(tv);

    }
}