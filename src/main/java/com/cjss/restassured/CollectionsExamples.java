package com.cjss.restassured;

import java.util.*;

public class CollectionsExamples {

    public static void main(String args[]) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for (String color: colors) {
            System.out.println(color);
        }

        Set<String> branches = new HashSet<>();
        branches.add("CSE");
        branches.add("ECE");
        branches.add("EEE");
        branches.add("ECE");

        for (String branch: branches) {
            System.out.println(branch);
        }

        Map<String, String> passwords = new HashMap<>();
        passwords.put("gmail", "gmail_password");
        passwords.put("hotmail", "hotmail_password");


        System.out.println(passwords.get("gmail"));

        for (String key: passwords.keySet()) {
            System.out.println(passwords.get(key));
        }


    }


}
