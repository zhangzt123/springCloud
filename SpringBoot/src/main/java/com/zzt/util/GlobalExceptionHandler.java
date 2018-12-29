package com.zzt.util;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 通过@ControllerAdvice，我们可以将控制器的全局配置放置在同一个位置，注解了
 * @ Controller的类的方法可使用@ExceptionHandler、@InitBinder、@ModelAttribute注解到方法上，
 * 这对所有注解了@RequestMapping的控制器内的方法有效。
 * @ ExceptionHandler：配置全局异常处理
 * @ InitBinder：配置WebDataBinder，自动绑定前台请求参数到Model中
 * @ ModelAttribute：@ModelAttribute本来的作用是绑定键值对到Model中，
 * 此处是让全局的@RequestMapping都能获得在此处设置的键值对。
 */
@ControllerAdvice
public class GlobalExceptionHandler {


private static final String errorpage ="error404";


@ExceptionHandler(value = Exception.class)
public String defaulteExceptionHandler( Exception e)
{
    ModelMap model= new ModelMap();
   // model.put("error",e.getMessage());
    return  errorpage;
}



}
