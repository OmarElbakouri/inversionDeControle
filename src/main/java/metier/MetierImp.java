package metier;

import dao.IDao;

public class MetierImp implements IMetier {
   private IDao dao;
   public MetierImp(IDao dao) {
       this.dao = dao;
   }

    public MetierImp() {
    }

    @Override
    public double calcul() {
        double sum = 1000* dao.getData();
        return sum;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
