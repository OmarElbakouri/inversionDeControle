package daoV2;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service ");
        return 1008;
    }
}
