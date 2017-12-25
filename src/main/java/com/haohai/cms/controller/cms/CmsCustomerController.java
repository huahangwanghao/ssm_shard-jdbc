package com.haohai.cms.controller.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.service.cms.CmsCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户control
 */
@RestController
@RequestMapping("/cms/customer")
public class CmsCustomerController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(CmsCustomerController.class);
	@Autowired
	private CmsCustomerService cmsCustomerService;

	/**
	 * 获取所有用户信息
	 *
	 * @param 
	 * @return
	 */
	@RequestMapping("/toUpdateCustomerAddress.do")
	public ResponseMessage getAllUser() {
		logger.info("获取所有用户信息:");
		ResponseMessage responseMessage=null;
		responseMessage=cmsCustomerService.getAllUser();
		return responseMessage;
	}


	/**
	 * 获取某个用户信息
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/toUpdateCustomerAddress.do")
	public ResponseMessage getUserById(int id) {
		logger.info("获取所有用户信息:");
		ResponseMessage responseMessage=null;
		responseMessage=cmsCustomerService.getUserById(id);
		return responseMessage;
	}


}
