package com.poo0054.dynamic.config;

import com.poo0054.dynamic.service.TableAttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 启动项目处理器 创建数据库
 *
 * @author ZhangZhi
 * @version 1.0
 * @since 2022/10/8 15:16
 */
@Component
@Slf4j
public class DbCreateHandle implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private TableAttributeService tableAttributeService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            //初始化表
            tableAttributeService.initTable();
        }
    }
}
