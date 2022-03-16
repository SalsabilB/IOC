package extension;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        //Version Web Service
        System.out.println("Ma version Web Service");
        double data=20;
        return data;
    }
}
