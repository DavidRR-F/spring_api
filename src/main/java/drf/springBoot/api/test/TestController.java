package drf.springBoot.api.test;

import org.springframework.web.bind.annotation.*;

import java.lang.constant.Constable;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("/hello")
    public Test hello() {
        return new Test(1,"David","Hello There");
    }
    @GetMapping("/hello/user/{name}")
    public Test sayHello(@PathVariable String name,@RequestParam String msg) {
        return new Test(1,name,msg);
    }
}
