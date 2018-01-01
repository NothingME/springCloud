package mine.zhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Creator: zhanqian 18/1/1 下午9:57
 * Description:
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("reply")
    public String reply(@RequestParam("name") String name) {
        return restTemplate.getForObject("http://localhost:8080/movie/hello?name=" + name, String.class) +
         ". nice to meet you, " + name;
    }

}
