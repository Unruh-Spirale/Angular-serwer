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

        Watch watch1 = new Watch("Tissot","Swiss","Gentleman Powermatic si", "automatic", "ETA C.07.811", 3300);
        Watch watch2 = new Watch("Steinhart","Swiss","Ocean One Ceramic Green", "automatic", "ETA 2824-2", 2650);
        Watch watch3 = new Watch("Roamer","Swiss","Competence Skeleton III", "automatic", "STP 6-15", 2550);
        Watch watch4 = new Watch("Junghans","Germany","Max Bill", "automatic", "J800.1", 3800);
        Watch watch5 = new Watch("Seiko","Japan","Presage Enamel", "automatic", "6R15", 4300);
        Watch watch6 = new Watch("G-Shock","Japan","Gravitymaster", "quartz", "-", 2200);

        watchService.addWatch(watch1);
        watchService.addWatch(watch2);
        watchService.addWatch(watch3);
        watchService.addWatch(watch4);
        watchService.addWatch(watch5);
        watchService.addWatch(watch6);
    }

}
