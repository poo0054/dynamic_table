package cn.dian1.dynamic.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangzhi
 * @date 2023/3/15
 */
public class DynamicTableEnableConfiguration implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{DynamicTableConfiguration.class.getName()};
    }
}
