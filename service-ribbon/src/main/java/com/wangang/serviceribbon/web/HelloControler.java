package com.wangang.serviceribbon.web;

import com.wangang.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** ribbon+rest消费者Controller
 * 
 * 基本形式=路由+server(restTemplete)
 * 
 * 个人认为：Controller层虽然没有区别，但feign那种server层通过接口注解、接口实现类定义熔断处理的方式更加简明，
 * 面向接口的方式也降低了熔断处理与正常业务的耦合度。
 * 
 * @author wangang
 *
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
