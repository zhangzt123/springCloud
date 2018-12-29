package com.zzt;

import com.zzt.basic.controller.basicController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZztApplicationTests {

    private MockMvc mvc;
   @Before
    public void befor()
    {
        mvc= MockMvcBuilders.standaloneSetup(new basicController()).build();
    }

    @Test
    public void basiccontroller() throws Exception {
        String url="/basic/helloworld";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON)).andReturn();
        //访问返回状态
        int status = mvcResult.getResponse().getStatus();
        //接口返回结果
        String content = mvcResult.getResponse().getContentAsString();
        //打印结果和状态
        System.out.println(status);
        System.out.println(content);
        //断言预期结果和状态
        Assert.assertTrue("错误", status == 200);
        Assert.assertFalse("错误", status != 200);
        /*Assert.assertTrue("数据一致", expectedResult.equals(content));
        Assert.assertFalse("数据不一致", !expectedResult.equals(content));*/

    }

}

