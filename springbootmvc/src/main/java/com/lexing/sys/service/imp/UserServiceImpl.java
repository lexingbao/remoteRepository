package com.lexing.sys.service.imp;


import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;





import org.springframework.transaction.annotation.Transactional;

import com.lexing.sys.common.RedisUtils;
import com.lexing.sys.mapper.NodeInfoMapper;
import com.lexing.sys.mapper.UserMapper;
import com.lexing.sys.model.NodeInfo;
import com.lexing.sys.model.User;
import com.lexing.sys.service.UserService;





@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger                 = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public UserMapper          mapper;
	
	@Autowired 
	public NodeInfoMapper nodeInfoMapper;
	@Resource
	RedisUtils redisUtils;
	 
	/**
	 * @CachePut 往缓存PUT @Cacheable 先往缓存查询KEY是否存在，存在就返回，不存在就执行方法  @CacheEvict 删除缓存中的key
	 * value 缓存明称 必须指定一个或多个  
	 * key 缓存键值
	 * Condition  缓存条件  Condition="id==2"
	 * unless 条件符合 不进行缓存  不符合进行缓存
	 */
	
	@CachePut(value="UserModel", key="myuser" ) 
    @Override
    public User getByOpenId(String openId) {
        if (openId==null || openId.equals("")) {
            return null;
        }
        List<User> list = mapper.getUserByOpenId(openId);
        
        //redisUtils.lSet("user001", list, 24*60*60);
        redisUtils.set("user0002", list,60);
        System.out.println((new Date()) + "set user0002");
        
        return list==null || list.isEmpty()? null:list.get(0);
    }
    
    @Override   
    @Transactional
    public int update(User user) {
        if (user==null) {
            return 9;
        }
        int ret = mapper.update(user);
        redisUtils.set("ret_int", ret);
		
		  NodeInfo nodeInfo = nodeInfoMapper.selectByPrimaryKey(new Long(157));
		  nodeInfo.setNodeName("0.02");
		  int v = this.updateNode(nodeInfo);
		//redisUtils.lSet("node",nodeInfo.getNodeName());
		  redisUtils.set("node111", nodeInfo.getNodeName(), 24*60*60);
		//  int i=10/0;
        return ret;
    }
   
    private int updateNode(NodeInfo nodeInfo) {
    	int val = nodeInfoMapper.updateByPrimaryKeySelective(nodeInfo);
    	
    	return val;
    }
    @Override  
    public void testCache() {
    	System.out.println((new Date()) +"start test Cache");
    	try{
    		Thread.sleep(61000);
    		boolean bl = redisUtils.hasKey("user0002");
    		if(bl==true) {
    			System.out.println((new Date()) +"kkkkkkkkkkkkkkkkk+存在");
    			Object obj = redisUtils.get("user0002");
    			List<User> list = (List)obj;
    			if(list!=null && list.size()>0) {
    				System.out.println((new Date())  +"sfdsdfsfsdf    " +list.get(0).getNickname());
    			}
    			
    		}else {
    			System.out.println((new Date()) +"kkkkkkkkkkkkkkkkk+获取不到");
    		}
    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    
    
    
    
}
