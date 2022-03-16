package metier;

import dao.IDao;

public class MetierImpl implements  IMetier{
    //Couplage faible
    private IDao dao=null;
    @Override
    public double calcul(){
        double d=dao.getData();
        double res=d*25;
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
