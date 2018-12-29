package com.zzt.basic.service.impl;

import com.zzt.basic.Mapper.BasicMapping;
import com.zzt.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class basicServiceImpl implements BasicService {
    @Autowired
    private BasicMapping basicMapping;
    public void setBasicMapping(BasicMapping basicMapping) {
        this.basicMapping = basicMapping;
    }




}
