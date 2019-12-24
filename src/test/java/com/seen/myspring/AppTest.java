package com.seen.myspring;

import static org.junit.Assert.assertTrue;

import com.seen.myspring.services.UserInfoService;
import com.seen.myspring.util.AppConfig;
import com.seen.myspring.util.Cal;
import com.seen.myspring.util.CalImpl;
import com.seen.myspring.util.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void shouldAnswerWithTrue2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10, 3);
        cal.sub(10, 3);
/*        cal.mul(2, 3);
        cal.div(10, 0);*/
/*        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        CalImpl bean = ac.getBean(CalImpl.class);
        bean.add(1,2);*/
    }


    @Test //只监听 calImpl2 的sub的方法
    public void shouldAnswerWithTrue3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl2");
        cal.add(10, 3);
        cal.sub(10, 3);
/*        cal.mul(2, 3);
        cal.div(10, 0);*/
/*        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        CalImpl bean = ac.getBean(CalImpl.class);
        bean.add(1,2);*/
    }

  @Test //AOP xml配置的一种实现
    public void shouldAnswerWithTrue4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl2");
        cal.add(10, 3);
        cal.sub(10, 3);
/*        cal.mul(2, 3);
        cal.div(10, 0);*/
/*        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        CalImpl bean = ac.getBean(CalImpl.class);
        bean.add(1,2);*/
    }


    @Test
    public void TestA() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserInfo userInfo = (UserInfo) applicationContext.getBean("userInfo");
        System.out.println(userInfo.toString());


    }


    @Test
    public void TestB() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserInfo userInfo = (UserInfo) applicationContext.getBean("userInfo2");
        System.out.println(userInfo.toString());
    }


    @Test
    public void TestC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserInfoService userInfoService = (UserInfoService) applicationContext.getBean("userInfoService");
        UserInfo userInfo = userInfoService.getUserInfo3();
        System.out.println(userInfo.toString());
    }


    @Test //使用名称空间的声明方式
    public void TestD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserInfoService userInfoService = (UserInfoService) applicationContext.getBean("userService");
        UserInfo userInfo = userInfoService.getUserInfo3();
        System.out.println(userInfo.toString());
    }

    @Test //注解AOP使用
    public void TestE() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserInfoService userInfoService = (UserInfoService) applicationContext.getBean("userService");
        UserInfo userInfo = userInfoService.getUserInfo3();
        System.out.println(userInfo.toString());
    }


}
