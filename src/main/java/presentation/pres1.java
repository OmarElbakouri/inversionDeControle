package presentation;

import dao.DaoImp;
import daoV2.DaoImpV2;
import metier.MetierImp;

public class pres1 {
    public static void main(String[] args) {

        DaoImp dao = new DaoImp();
        DaoImpV2 dao2 = new DaoImpV2();
        MetierImp metierimp= new MetierImp(dao);

        System.out.println(metierimp.calcul());


    }
}
