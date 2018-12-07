package hello;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Desc: NameClient
 * Author: xuhe
 * Date: 2018/12/6 5:58 PM
 * Version: 1.0
 */
@FeignClient("name")
interface NameClient{
    //@GetMapping("/user/name")
    @RequestMapping(value = "/user/name", method = RequestMethod.GET)
    String getName();
}
