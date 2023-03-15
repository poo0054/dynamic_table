package cn.dian1.dynamic.service;

import cn.dian1.dynamic.entity.TableDynamic;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * (TableDynamic)表服务接口
 *
 * @author zhangzhi
 * @since 2022-10-09 10:10:29
 */
public interface TableDynamicService extends IService<TableDynamic> {


    /**
     * 根据类型查询所有数据
     *
     * @param tableCode 类型
     * @return 所有数据
     */
    List<TableDynamic> tableCode(String tableCode);

    /**
     * 创建表
     *
     * @return 是否成功
     */
    boolean createTable();
}

