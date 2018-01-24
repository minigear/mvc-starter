package net.ujacha.hot.mvcstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/hello")
public class HelloRestController {

    @GetMapping()
    public Map<String, Object> hello(){
        Map<String, Object> map = new HashMap<>();

        map.put("message", "Hello");

        return map;
    }
}
