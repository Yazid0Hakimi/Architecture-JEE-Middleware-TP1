package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXMLFile {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("XML : " + metier.calcul());
    }
}
