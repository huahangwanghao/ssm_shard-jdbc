package com.haohai.cms.controller;

import org.springframework.beans.factory.annotation.Value;

public class BaseController {

	/** 错误信息 */
	@Value("${ERROR_MSG}")
	public String ERROR_MSG;

	/** 图片访问路径 */
	@Value("${IMAGE_BASEPATH}")
	public String IMAGE_BASEPATH;

	/** 分页大小 */
	@Value("${PER_PAGE}")
	public Integer PER_PAGE;

	/** 查询成功 */
	@Value("${FIND_SUCCESS}")
	public String FIND_SUCCESS;

	/** 注册成功 */
	@Value("${REGIST_SUCCESS}")
	public String REGIST_SUCCESS;

	/** 删除成功 */
	@Value("${DELETE_SUCCESS}")
	public String DELETE_SUCCESS;

	/** 修改成功 */
	@Value("${UPDATE_SUCCESS}")
	public String UPDATE_SUCCESS;

	/** 添加成功 */
	@Value("${ADD_SUCCESS}")
	public String ADD_SUCCESS;

	/** 保存成功 */
	@Value("${SAVE_SUCCESS}")
	public String SAVE_SUCCESS;

	/** 登录成功 */
	@Value("${LOGIN_SUCCESS}")
	public String LOGIN_SUCCESS;

	/** 登录失败 */
	@Value("${LOGIN_FAIL}")
	public String LOGIN_FAIL;

	/** 文件上传路径 */
	@Value("${UPLOAD_DIR}")
	public String UPLOAD_DIR;

	/** 读取快递查询的code */
	@Value("${EXPRESS_APPCODE}")
	public String EXPRESS_APPCODE;


}
