package per.mock.mar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.mock.mar.Common.Response.ErrorCode;
import per.mock.mar.Common.Response.R;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public R getKeyString() {

        return R.success("hello,world");
    }

    @GetMapping("/getWeather")
    public R getBeijingWeather() {

        return R.fail("Please retry");
    }
}
