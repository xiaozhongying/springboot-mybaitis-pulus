package com.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.dao.UserMapper;
import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService  {
   @Autowired
    private UserMapper mapper;

   public List<User> findAll(){

       return mapper.selectList(null);
   }
    public IPage<User> findPage(){
        mapper.selectById(3);
        Map<String,Object> map=new HashMap<>();
        map.put("username","李四");
        mapper.selectByMap(map);
        Page<User> page=new Page<>(1,5);
        QueryWrapper<User> query=new QueryWrapper<>();
        query.orderByDesc("id");
        User user=new User();
        user.setId(2);
        IPage<User> iPage=mapper.selectPage(page,query);
        user.setId(7);
        user.setSex("男");
        mapper.updateById(user);
       return iPage;
    }
    public void addUser(User user){
        mapper.insert(user);
    }
    public void updateUser(User user){
       mapper.selectById(3);
        Map<String,Object> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        mapper.deleteBatchIds(list);
    }
}
