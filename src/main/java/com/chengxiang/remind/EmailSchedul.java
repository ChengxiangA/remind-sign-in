package com.chengxiang.remind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 程祥
 * @date 2022/11/8 13:18
 */
@Component
public class EmailSchedul {
    @Autowired
    private SendMessage sendMessage;

    @Scheduled(cron = "0 0 9 ? * 2,3,4,5,6")
    public void sendMessage() {
        sendMessage.sendMessage("打卡助手","该打卡了小子!!!");
    }
}
