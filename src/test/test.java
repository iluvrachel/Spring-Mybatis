package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Store;
import dao.StoreMybatisDao;

public class test {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        StoreMybatisDao storeDao=(StoreMybatisDao) ctx.getBean("storeDao");
        Store store=new Store();
        
        store = storeDao.getStore(5);
        System.out.println(store.getName().toString());
        
    }

}