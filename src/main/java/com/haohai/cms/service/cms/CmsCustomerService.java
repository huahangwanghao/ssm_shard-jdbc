package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface CmsCustomerService {


    /**
     * 获取所有用户信息
     * @param 
     * @return
     */
    ResponseMessage getAllUser();

    /**
     * 获取所有用户信息
     * @param
     * @return
     */
    ResponseMessage getUserById(int id);


}
