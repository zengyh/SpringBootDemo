package codex.terry.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 编写人: yh.zeng
 * 编写时间: 2018-8-28
 * 文件描述:
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(value = "/{content}")
    private String hello(@PathVariable("content") String conent){
        return conent;
    }

}
