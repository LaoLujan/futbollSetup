/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbollsetup;

/**
 *
 * @author NHLUJ
 */
public class Player {
    String fname;
    String lname;
    String country;
    int age;
    String position;

    public Player(String fname, String lname, String country, int age, String position) {
        this.fname = fname;
        this.lname = lname;
        this.country = country;
        this.age = age;
        this.position = position;
    }
    
    

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
