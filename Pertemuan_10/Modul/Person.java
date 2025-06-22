/*
 * Nama File: Person.java
 * Nama     : Moh Yusril Nur Syabani - 24060123140181
 * Deskripsi: Person database model
 * Tanggal  : 22 Juni 2025
 */

 public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
 }