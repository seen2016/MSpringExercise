package com.seen.myspring;

import static org.junit.Assert.assertTrue;

import com.seen.myspring.util.AppConfig;
import com.seen.myspring.util.Cal;
import com.seen.myspring.util.CalImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


     @Test
    public void shouldAnswerWithTrue2()
    {
/*        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10,3);
        cal.sub(10,3);
        cal.mul(2,3);
        cal.div(10,0);*/
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        CalImpl bean = ac.getBean(CalImpl.class);
        bean.add(1,2);
    }




}
