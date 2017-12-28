package com.zhaoyou.webservice;

import com.zhaoyou.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by zhaoyou on 27/12/2017.
 */
@WebService(name = "CommonService", // 暴露服务名称
        targetNamespace = "http://webservice.zhaoyou.com/"// 命名空间,一般是接口的包名倒序
)
public interface CommonService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    public String sayHello(@WebParam(name = "userName") String name);


    @WebMethod
    @WebResult(name = "User", targetNamespace = "")
    public List<User> getUserList(@WebParam(name = "userName") String name);

}