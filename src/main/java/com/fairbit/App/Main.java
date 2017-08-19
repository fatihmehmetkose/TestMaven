package com.fairbit.App;

import com.google.gson.Gson;

/**
 * Created by fatih.kose on 18.08.2017.
 */
public class Main {

    /**
     * Entry point
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(500);
        person.setName("John Wayne");

        Gson gson = new Gson();

        System.out.printf(" Json message : %s", gson.toJson(person));
    }
}
