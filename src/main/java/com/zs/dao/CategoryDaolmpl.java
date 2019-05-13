package com.zs.dao;

import com.zs.vo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("categoryDaolmpl")
public class CategoryDaolmpl  implements CategoryDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void login() {
        System.out.println("此处是实现dao层的方法");
        String  hql="from Category";
        List<Category> list= (List<Category>) hibernateTemplate.find(hql);

        for (Category c:list) {
            System.out.println(c.getCname());
        }
    }
}
