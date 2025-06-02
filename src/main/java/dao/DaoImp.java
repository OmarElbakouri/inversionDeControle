package dao;

public class DaoImp implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de donnes");
        return 1001;
    }
}
