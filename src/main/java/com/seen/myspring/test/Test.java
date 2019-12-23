package com.seen.myspring.test;


import com.seen.myspring.util.AppConfig;
import com.seen.myspring.util.Cal;
import com.seen.myspring.util.CalImpl;
import com.seen.myspring.util.UserInfo;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
//        //创建委托对象
//        Cal cal = new CalImpl();
//        //获取动态代理对象
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
//        Cal cal1 = (Cal) myInvocationHandler.bind(cal);
//        cal1.add(10,3);
//        cal1.sub(10,3);
//        cal1.mul(10,3);
//        cal1.div(10,3);
/*        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10, 3);
        cal.sub(10, 3);
        cal.mul(2, 3);
        cal.div(10, 0);*/

        /**
         * 解析配置
         * 扫描
         * parse...
         * new BeanDefinition put map
         * 遍历map
         * 验证
         * 实例化
         */
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        CalImpl bean = ac.getBean(CalImpl.class);
        System.out.println(bean.add(1,2));
/*        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        UserInfo calImpl = (UserInfo) xmlBeanFactory.getBean("userInfo");
        calImpl.setName("dsadsa");
        System.out.println(calImpl.getName());*/
    }
}
