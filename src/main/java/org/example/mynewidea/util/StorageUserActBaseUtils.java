package org.example.mynewidea.util;

/**
* @InterfaceName BaseUtilsInterface
* @Description 用于统一管理实现类以及空结构体
* @Date 2025/5/6 11:27
* @author by 王玉涛
*/
public interface StorageUserActBaseUtils {

    /**
     * 存储用户行为
     * @param type
     * @param userId
     */
    default void storageUserAct(String type, Long userId) {
        return;
    }
}
