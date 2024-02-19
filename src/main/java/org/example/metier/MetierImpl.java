package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MetierImpl implements IMetier {

    @Autowired
//    @Qualifier("VWS")
    @Qualifier("VC")
//    Autowired is deprecated it will be better working with setter or constructor
    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp * 23;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
