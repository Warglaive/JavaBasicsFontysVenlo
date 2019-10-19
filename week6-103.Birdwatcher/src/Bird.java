/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Bird {

    public String Name;
    public String LatinName;
    public String FullName;
    public int Count;

    public Bird(String name, String latinName) {
        this.Name = name;
        this.LatinName = latinName;
        this.FullName = this.Name + " " + "(" + this.LatinName + ")";
        this.Count = 0;
    }
}
