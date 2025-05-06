package org.example.mynewidea.config;

import org.example.mynewidea.util.StorageUserActBaseUtils;
import org.example.mynewidea.util.StorageUserActUtils;
import org.example.mynewidea.util.StorageUtilsEmpty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by 王玉涛
 * @Classname StorageConfig
 * @Description 用于必须配置类
 * @Date 2025/5/6 11:26
 */
@Configuration
public class StorageConfig {

    /**
     * 返回用户行为存储工具
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "storage.user.act.enable", havingValue = "true", matchIfMissing = false)
    public StorageUserActBaseUtils storageUserActUtils() {
        return new StorageUserActUtils();
    }

    /**
     * 返回用户行为存储工具(空结构体)
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "storage.user.act.enable", havingValue = "false")
    public StorageUserActBaseUtils storageUserActEmptyUtils() {
        return new StorageUtilsEmpty();
    }
}
