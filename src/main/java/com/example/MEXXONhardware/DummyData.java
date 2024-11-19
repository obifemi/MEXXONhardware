package com.example.MEXXONhardware;

import com.example.MEXXONhardware.DB.Hardware;
import com.example.MEXXONhardware.DB.ITAdmin;
import com.example.MEXXONhardware.Repo.ITAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

@Component
public class DummyData {

    @Autowired
    ITAdminRepo itAdminRepo;
    @Bean(initMethod = "init")
    public void createDummy(){
       // ITAdmin mert = new ITAdmin();
       // mert.setContact("0176123123");
       // mert.setEmail("mertsEmail");
       // mert.setName("mert");
       // itAdminRepo.save(mert);


       List<ITAdmin> itAdminList = itAdminRepo.findAll();
       //Set<Hardware> mertHards=
       //System.out.println(itAdminList.get(0).getHardwares());
       int debugpoint =0;

    }
}
