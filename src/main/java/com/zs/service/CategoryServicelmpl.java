package com.zs.service;

import com.zs.dao.CategoryDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service(value = "categoryServicelmpl")
public class CategoryServicelmpl implements CategoryService{

    @Resource(name = "categoryDaolmpl")
    private CategoryDao categoryDao;

    @Override
    public void login() {
        categoryDao.login();
    }
}
