package com.poo0054.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 启动项目处理器 创建数据库
 *
 * @author ZhangZhi
 * @version 1.0
 * @since 2022/10/8 15:16
 */
@Component
public class DbCreateHandle implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            //创建表

        }
    }
}
