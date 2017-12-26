package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/12/26.
 */

import com.haohai.cms.mapper.TUserMapper;
import com.haohai.cms.service.cms.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangH
 * @create 2017-12-26 14:55
 **/
@Service
public class Aimpl implements A {
    @Autowired
    private TUserMapper tUserMapper;
    
    public void test(){
        System.out.println("123"+tUserMapper);
    }
}
