package org.example.mynewidea.util;

import lombok.SneakyThrows;
import org.example.mynewidea.constant.SystemConstant;

/**
 * @author by 王玉涛
 * @Classname StorageUserActUtils
 * @Description TODO
 * @Date 2025/5/6 11:30
 */
public class StorageUserActUtils implements StorageUserActBaseUtils {

    /**
     * 存储用户行为
     * @param type
     * @param userId
     */
    @SneakyThrows
    @Override
    public void storageUserAct(String type, Long userId) {
        Thread.sleep(SystemConstant.SHORT_SLEEP_TIME);
    }
}
