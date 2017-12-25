package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.mapper.TUserMapper;
import com.haohai.cms.service.cms.CmsCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 客户service
 *
 * @author WangH
 * @create 2017-08-03 15:00
 **/
@Service
@Transactional
public class CmsCustomerServiceImpl implements CmsCustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CmsCustomerServiceImpl.class);
    @Autowired
    private TUserMapper tUserMapper;
    
    
    /**
     * 获取所有用户信息
     *
     * @return
     */
    @Override
    public ResponseMessage getAllUser() {
        ResponseMessage rm= ResponseMessage.createSuccessMsg(tUserMapper.getAllUser());
        logger.info("返回结果:"+rm);
        return rm;
    }

    /**
     * 获取所有用户信息
     *
     * @param id@return
     */
    @Override
    public ResponseMessage getUserById(int id) {
        System.out.println(tUserMapper);
        ResponseMessage rm= ResponseMessage.createSuccessMsg(tUserMapper.getUserById(id));
        logger.info("返回结果:"+rm);
        return rm;
    }
}
