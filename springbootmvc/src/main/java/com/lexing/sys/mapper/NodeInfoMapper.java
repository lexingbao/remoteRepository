package com.lexing.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lexing.sys.model.NodeInfo;

@Mapper
public interface NodeInfoMapper {

    List<NodeInfo> getNodeInfoByKey(@Param("keys") String ... key);


    List<NodeInfo> getNodeInfoByType(@Param("type") String type);
    
    int updateByPrimaryKeySelective(NodeInfo object);
    
    NodeInfo selectByPrimaryKey(@Param("id") Long id);

}
