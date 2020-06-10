package com.wangang.servicefeign.clients.fallback;

import com.wangang.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/** 熔断处理
 * 
 * 通过接口+实现类的形式熔断处理
 * 
 * @author wangang
 *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}