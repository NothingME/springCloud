package mine.zhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Creator: zhanqian 18/1/1 下午10:43
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurecaApplication.class, args);
    }
}
