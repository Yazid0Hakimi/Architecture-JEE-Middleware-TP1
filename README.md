# Mini-Framework d'Injection de Dépendances

## Introduction

Ce projet illustre l'implémentation d'un framework d'injection de dépendances en Java. Il se compose de deux parties :

### Partie 1 : Implémentation des Interfaces et Injection de Dépendances

1. **Interface IDao :**
    - Création de l'interface `IDao` avec une méthode `getData`.

2. **Implémentation DaoImpl :**
    - Implémentation de l'interface `IDao` dans la classe `DaoImpl`.
    - Utilisation des annotations Spring pour la recherche de composants.

3. **Interface IMetier :**
    - Création de l'interface `IMetier` avec une méthode `calcul`.

4. **Implémentation MetierImpl avec Faible Couplage :**
    - Implémentation de l'interface `IMetier` dans la classe `MetierImpl`.
    - Démonstration d'un faible couplage avec l'injection de dépendances via un setter.

5. **Injection de Dépendances :**
    - Présentation de l'injection de dépendances à travers :
        - Instanciation statique dans `Presentation1`.
        - Instanciation dynamique à partir du fichier Config.txt dans `PresentationFile`.
        - Injection de dépendances avec le framework Spring en versions XML et annotations.

### Partie 2 : Mini-Projet - Framework d'Injection de Dépendances

Développement d'un mini-framework pour l'injection de dépendances avec prise en charge des configurations XML et annotations.

1. **Configuration XML :**
    - Configuration des dépendances via XML avec Jax Binding.
    - Définition des beans pour les classes `DaoImplCapteur` et `MetierImpl`.

2. **Configuration par Annotations :**
    - Utilisation des annotations Spring pour l'injection de dépendances dans la classe `MetierImpl`.
    - Présentation des différentes possibilités d'injection : constructeur, setter et attribut (champ).

3. **Possibilités d'Injection :**
    - Injection par constructeur, injection par setter et injection par attribut (champ).

4. **Captures d'écran :**
    - Inclusion de captures d'écran pour l'instanciation statique et dynamique.

## Conclusion

En conclusion, ce projet offre un exemple complet d'injection de dépendances en Java, comprenant un mini-framework prenant en charge les configurations en XML et par annotations.
