package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.service.cms.CmsCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
   
    /**
     * 获取所有用户信息
     *
     * @return
     */
    @Override
    public ResponseMessage getAllUser() {
        return null;
    }

    /**
     * 获取所有用户信息
     *
     * @param id@return
     */
    @Override
    public ResponseMessage getUserById(int id) {
        return null;
    }
}
