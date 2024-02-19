package org.example.ext;

import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.springframework.stereotype.Component;
@Component("VWS")

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Web Service");
        return 60000;    }
}
