package me.zingon.Test.service.impl;

import me.zingon.Test.dao.TestDao;
import me.zingon.Test.model.Test;
import me.zingon.Test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZTC on 2/21/2017.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public List<Test> listAll() {
        return testDao.listAll();
    }
}
