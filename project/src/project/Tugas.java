/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <String> List = new ArrayList<>();
    {
        int counter=0;

        ArrayList<String> a = new ArrayList<String>(List);
        a.add("erza");
        a.add("wahyu");
        a.add("salsa");
        a.remove(1);
        
        for(String b:a)
            System.out.println("ArrayList c element"+b);
        
        
        System.out.println(a);
    }
    }
    
}
