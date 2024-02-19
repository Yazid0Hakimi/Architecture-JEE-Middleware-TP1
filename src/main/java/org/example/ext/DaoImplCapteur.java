package org.example.ext;

import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("VC")
public class DaoImplCapteur implements IDao{
        @Override
        public double getData() {
            System.out.println("version Capteur");
            return 120000;    }
    }
