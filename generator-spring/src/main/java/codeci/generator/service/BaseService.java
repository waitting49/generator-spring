package codeci.generator.service;

import codeci.generator.config.ConfigBeanValue;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @Description:
 * @Author: gjc
 * @Date: 2020/4/15 22:35
 * @Version: 2.0
 */
@Service
public class BaseService {

    @Resource
    ConfigBeanValue configBeanValue;

    @PostConstruct
    public void start(){
        System.out.println("测试启动"+configBeanValue.getTables());
    }

}
