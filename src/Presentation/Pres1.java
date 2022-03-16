package Presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //cette classe n'est pas fermée à la modiffication "new"
        //Injection des dépendances par instanciation statique "new"
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
