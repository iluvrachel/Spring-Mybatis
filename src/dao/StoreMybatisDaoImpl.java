package dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pojo.Store;

//该接口不实现也可以出结果，只需在接口类dao加上component

@Component
public class StoreMybatisDaoImpl implements StoreMybatisDao {  
    @Resource  
    private StoreMybatisDao storeDao;  
    @Override  
    public Store getStore(int id) {  
        // TODO Auto-generated method stub  
        return this.storeDao.getStore(id);  
    }  
  
}  
