package cn.dian1.dynamic.config;

import cn.dian1.dynamic.service.TableAttributeService;
import cn.dian1.dynamic.service.TableDynamicService;
import cn.dian1.dynamic.service.impl.TableAttributeServiceImpl;
import cn.dian1.dynamic.service.impl.TableDynamicServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangzhi
 * @date 2023/3/15
 */
@MapperScan("com.poo0054.dynamic.**.dao")
public class DynamicTableConfiguration {

    @Bean
    public DbCreateListener dbCreateListener() {
        return new DbCreateListener();
    }
}
