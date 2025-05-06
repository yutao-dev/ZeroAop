package org.example.mynewidea.service;

import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import org.example.mynewidea.constant.SystemConstant;
import org.example.mynewidea.util.StorageUserActBaseUtils;
import org.springframework.stereotype.Service;

/**
 * @author by 王玉涛
 * @Classname UserService
 * @Description TODO
 * @Date 2025/5/6 11:37
 */
@Service
public class UserService {

    @Resource
    private StorageUserActBaseUtils storageUserActUtils;

    @SneakyThrows
    public void clickSession(Long userId) {
        // 模拟业务耗时
        Thread.sleep(SystemConstant.SLEEP_TIME);
        storageUserActUtils.storageUserAct("clickSession", userId);
    }
}
