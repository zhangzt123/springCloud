package com.zzt.Config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport{

    @Autowired
    Interceptor interceptor;
    /**
     * 静态资源文件路径
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /**  覆盖配置文件中的 static-path-pattern
        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
                /*.addResourceLocations("classpath:/res/")
                .addResourceLocations("classpath:/cesium/")
                .addResourceLocations("classpath:/ErrorPage/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/templates/");*/
        super.addResourceHandlers(registry);
    }

    /**
     * 拦截器
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor)
                        //addPathPatterns 用于添加拦截规则
                        .addPathPatterns("/**")
                        //excludePathPatterns 用于排除拦截
                        .excludePathPatterns("/loginController*");
        super.addInterceptors(registry);
    }

}
