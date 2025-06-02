package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
public static void main(String[] args) {
    try {
    Scanner sc = new Scanner(new File("config.txt"));
    String sDao = sc.nextLine();
    String sMetier = sc.nextLine();

     Class<?> cls = Class.forName(sDao);
     IDao dao = (IDao) cls.getDeclaredConstructors()[0].newInstance();
     Class<?> clsMetier = Class.forName(sMetier);
     IMetier metier =(IMetier)clsMetier.getDeclaredConstructor().newInstance();
     Method m = clsMetier.getMethod("setDao",IDao.class);
     m.invoke(metier,dao);
     System.out.println("resultat"+metier.calcul());

    } catch (Exception e) {
       e.printStackTrace();
    }
}
}
