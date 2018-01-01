package mine.zhan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creator: zhanqian 18/1/1 下午9:54
 * Description:
 */
@RestController
public class MoveController {

    @GetMapping("hello")
    public String sayHello(@RequestParam("name") String name) {
        return "hi " + name;
    }
}
