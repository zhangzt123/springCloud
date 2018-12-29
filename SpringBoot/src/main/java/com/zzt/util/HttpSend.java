package com.zzt.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.springframework.context.annotation.Configuration;


@Configuration("HttpSend")
public class HttpSend {


    public String sendPost(String url, NameValuePair[] param) throws Exception{

        String soapRequestData="";
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(url);
        postMethod.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
        postMethod.setRequestBody(param);
        int statusCode = httpClient.executeMethod(postMethod);
        if(statusCode== HttpStatus.SC_OK) {
            //System.out.println(statusCode);
             soapRequestData = postMethod.getResponseBodyAsString();
        }
            return soapRequestData;
    }



    @Test
    public  void run() {

       // String param  = "{\"userCode\":\"chinalife\",\"password\":\"ee1388aa-2c6d-4b21!\"}";
        NameValuePair[] nameValuePairs = new  NameValuePair[]{new NameValuePair("userCode","chinalife"),new NameValuePair("password","ee1388aa-2c6d-4b21!")};
        //发送 POST 请求
        String sr0="",sr1="",sr2 ="";
        try {
            sr0 = sendPost(/*"login",*/"http://9.0.8.108:8080/ssbfweb/login.json",nameValuePairs);
            JSONObject jsonObject = JSON.parseObject(sr0);
            String token =jsonObject.getString("token");
            sr1= sendPost(/*"login",*/"http://9.0.8.108:8080/ssbfweb/flow.json",new NameValuePair[]{new NameValuePair("token",token)});
            sr2 = sendPost(/*"login",*/"http://9.0.8.108:8080/ssbfweb/provsumflow.json",new NameValuePair[]{new NameValuePair("token",token)});
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sr0);
        System.out.println(sr1);
        System.out.println(sr2);
    }
}



