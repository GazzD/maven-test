package com.ironhack.maventest.main;

import com.google.gson.Gson;
import com.ironhack.maventest.classes.*;
import com.ironhack.maventest.enums.UserStatus;
import com.ironhack.maventest.enums.Weekday;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Maven");

        System.out.println(UserStatus.INACTIVE.ordinal());

        User user = new User("Víctor", "vcardozof@gmail.com", 31);

        System.out.println(Weekday.SUNDAY);

        System.out.println(user);

        user.setStatus(UserStatus.BANNED);

        System.out.println(user);

        System.out.println(user.getStatus().getTranslation());


        List<String> names = new ArrayList<>();
        names.add("Alejandro");
        names.add("Hiban");
        names.add("Alicia");
        names.add("Irene");

        names.set(1, "Iván");
        names.remove(0);

        System.out.println(names);

        for(int i=0; i<names.size();i++) {
            System.out.println(names.get(i));
        }

        Map<String, String> countriesCapital = new HashMap<>();
        countriesCapital.put("Italia", "Roma");
        countriesCapital.put("Españita", "Madrid");
        countriesCapital.put("Kazajistan", "Astaná");

        System.out.println(countriesCapital.get("Italia"));

        Map<String, Country> countries = new HashMap<>();
        Country italy = new Country("Italy", "Roma", 60);
        countries.put("Italia", italy);
        countries.put("Españita", new Country("Spain", "Madrid", 47));
        countries.put("Kazajistan", new Country("Kazajistan", "Astaná", 18));

        System.out.println(countries.get("Españita").getPopulation());

        countries.put("Españita", italy);
        System.out.println(countries.get("Españita").getPopulation());

        countries.put("España", new Country("Spain", "Madrid", 47));
        countries.remove("Españita");

        System.out.println(countries);

        for(Country country : countries.values()) {
            System.out.println(country.getCapital());
        }

        for(String countryName : countries.keySet()){
            System.out.println("Key: " + countryName + " Value: " + countries.get(countryName));
        }

        countries.forEach((k, v) -> System.out.println("k: " + k + " v: " + v.getCapital()));


    }

    public static void classEquivalences() {

        User user1 = new User("Víctor", "vcardozof@gmail.com", 31);
        User user2 = new User("Víctor", "vcardozof@gmail.com", 31);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.equals(user2));

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        System.out.println(userSet);
    }

    public static void exceptionClass() {
        //        int y = 1;
//        int x = y == 1 ? 5 : y==2 ? 2 : 1;

//        try {
//            // Código que puede lanzar una excepción
//        } catch (Exception e) {
//            // Lo que se ejecuta cuando salta este tipo de excepción
//        } finally {
//          // Este trozo de código se ejecuta independientemente si la ejecución fue correcta o no
//        }

        try {
            printArray();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :C");
        } catch (NullPointerException e)  {
            System.out.println(e.getMessage());
            System.out.println("Esto solo ocurre si es null");
        } finally {
            System.out.println("Esto se va a ejecutar siempre");
        }

        MathLibrary mathLibrary = new MathLibrary();

        try {
            int[] numArray = mathLibrary.createArray(-10);

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin del código");
    }

    public static void printArray() throws ArrayIndexOutOfBoundsException, NullPointerException {
        int[] numArray = new int[10];
        for(int i=0; i< 20; i++) {
            System.out.println(numArray[i]);
        }
        System.out.println("Finalizo  el bucle");

    }

    public static void jsonHandling() {
        List<InvoiceItem> invoiceItems = List.of(
                new InvoiceItem("Coca Cola 2L", new BigDecimal("10")),
                new InvoiceItem("Rum Santa Teresa 0.7L", new BigDecimal("15")),
                new InvoiceItem("Ice bag L", new BigDecimal("5.5"))
        );

        Invoice invoice = new Invoice("YMZ-0000001", new BigDecimal("5.5"), false, invoiceItems);

        System.out.println(invoice);

        Gson gson = new Gson();

        System.out.println(gson.toJson(invoice));

        String invoiceJson = "{\"id\":\"YMZ-0000002\",\"total\":5.5,\"isPaid\":false,\"items\":[{\"name\":\"Coca Cola 2L\",\"price\":10},{\"name\":\"Rum Santa Teresa 0.7L\",\"price\":15},{\"name\":\"Ice bag L\",\"price\":5.5}]}";

        System.out.println(invoiceJson);

        Invoice invoice2 = gson.fromJson(invoiceJson, Invoice.class);
        System.out.println(invoice2);
    }
}
