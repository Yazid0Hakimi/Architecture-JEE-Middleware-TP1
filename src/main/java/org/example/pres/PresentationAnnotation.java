package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.ext", "org.example.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Annotation : " + metier.calcul());
    }
}
