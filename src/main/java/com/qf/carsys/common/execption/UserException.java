package com.qf.carsys.common.execption;

/**
 * @program: carsys
 * @description 会员异常   自定义异常
 * @author: 王伟达
 * @create: 2019-12-10 16:00
 **/
public class UserException  extends Exception{
    public UserException(){
        super();
    }
    public UserException(String msg){
        super(msg);
    }

}
