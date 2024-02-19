package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        System.out.println("using New");
        DaoImpl dao =new DaoImpl();
//        MetierImpl metier = new MetierImpl();
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
