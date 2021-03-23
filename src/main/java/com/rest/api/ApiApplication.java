package com.rest.api;

import com.rest.api.entity.Watch;
import com.rest.api.service.WatchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ApiApplication.class, args);

        WatchService watchService = ctx.getBean(WatchService.class);

        Watch watch1 = new Watch("Tissot","Swiss","Gentleman Powermatic si", "automatic", "ETA C.07.811", "renew bracelet","2021-05-30", 300);
        Watch watch2 = new Watch("Steinhart","Swiss","Ocean One Ceramic Green", "automatic", "ETA 2824-2", "damaged case","2021-09-01", 400);
        Watch watch3 = new Watch("Roamer","Swiss","Competence Skeleton III", "automatic", "STP 6-15", "adjust movement","2021-04-21", 150);
        Watch watch4 = new Watch("Junghans","Germany","Max Bill", "automatic", "J800.1", "exchange crystal","2021-08-19",500);
        Watch watch5 = new Watch("Seiko","Japan","Presage Enamel", "automatic", "6R15", "exchange balance spring","2021-07-07",600);
        Watch watch6 = new Watch("G-Shock","Japan","Gravitymaster", "quartz", "-", "exchange battery","2021-05-15", 500);

        watchService.addWatch(watch1);
        watchService.addWatch(watch2);
        watchService.addWatch(watch3);
        watchService.addWatch(watch4);
        watchService.addWatch(watch5);
        watchService.addWatch(watch6);
    }

}
