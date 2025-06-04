package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MetierImp implements IMetier {
    @Autowired
   private IDao dao;

   public MetierImp( IDao dao) {
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
