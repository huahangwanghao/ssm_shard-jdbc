package com.haohai.test;

import com.haohai.cms.service.cms.CmsCustomerService;
import com.haohai.cms.service.cms.impl.CmsCustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/12/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-context.xml",})
public class CmsCustomerServiceImplTest {

    CmsCustomerService cmsCustomerService;
    
    @org.junit.Before
    public void setUp() throws Exception {
        cmsCustomerService=new CmsCustomerServiceImpl();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getAllUser() throws Exception {

    }

    @Test
    public void getUserById() throws Exception {
        cmsCustomerService.getAllUser();
    }

}