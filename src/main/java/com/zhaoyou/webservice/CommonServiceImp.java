package com.zhaoyou.webservice;

import com.zhaoyou.domain.CustomerRepository;
import com.zhaoyou.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by zhaoyou on 27/12/2017.
 */
@WebService(serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.zhaoyou.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.zhaoyou.webservice.CommonService"// 接口地址
)
@Component
public class CommonServiceImp implements CommonService {

    @Autowired
    CustomerRepository repository;

    @Override
    public String sayHello(String name) {

        return "Hello ," + name;
    }

    @Override
    public List<User> getUserList(String name) {
        return repository.getUserList();
    }


}