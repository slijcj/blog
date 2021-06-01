package com.moxi.mogublog.picture.config;

import com.moxi.mougblog.base.handler.HandlerExceptionResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局异常处理配置
 *
 * @author Ckp_Pro
 * @date 2021年4月4日10:44:17
 */
@Configuration
public class GlobalExceptionConfig {

    @Bean
    public HandlerExceptionResolver getHandlerExceptionResolver() {
        return new HandlerExceptionResolver();
    }
}
