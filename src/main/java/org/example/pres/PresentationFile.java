package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationFile {

    public static void main(String[] args) throws Exception {
        System.out.println("Config.txt File");
        Scanner sc = new Scanner(new File("Config.txt"));
        String daoClassName = sc.nextLine();
        String metierClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao=(IDao)cDao.getConstructor().newInstance();

        //
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
