package com.lexing.sys.service;

import java.util.List;

import com.lexing.sys.model.User;





public interface UserService {
    User getByOpenId(String openId);
    
    public int update(User user);
    
    public void testCache();
    
   

}
