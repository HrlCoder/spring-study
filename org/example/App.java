package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean返回方法就是一个Object类型
        LoginController loginController = (LoginController) context.getBean("loginController");
        System.out.println(loginController);
        System.out.println(loginController.getLoginService());

        //验证loginController依赖注入的loginService是否为容器中的对象
        LoginService loginService = context.getBean(LoginService.class);
        System.out.println(loginController.getLoginService() == loginService);

        //打印User对象
        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);

//        //同一个类型注册多个Bean对象到容器中，不能通过类型获取，从而报错
//        User user3 = context.getBean(User.class);
//        System.out.println(user3);  //NoUniqueBeanDefinitionException

        AppConfig appConfig =context.getBean(AppConfig.class);
        System.out.println(appConfig);

        User user = (User) context.getBean("byFactoryBean");
        System.out.printf("get bean by FactoryBean: %s%n", user);



        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}