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
        Person p = new Person();
        p.setId(100);
        p.setName("John Wayne");

        Gson gson = new Gson();

        System.out.println(gson.toJson(p));
    }
}
