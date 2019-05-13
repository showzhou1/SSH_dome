package com.zs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zs.service.CategoryService;
import com.zs.vo.Category;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value ="login")
@Scope("prototype") //单例模式
public class Login extends ActionSupport implements ModelDriven<Category> {
    private  Category category=new Category();
    public Category getModel() {
        return category;
    }

    @Resource(name = "categoryServicelmpl")
    private CategoryService categoryService;

    public String list(){

        categoryService.login();
        return "login";
    }


}
