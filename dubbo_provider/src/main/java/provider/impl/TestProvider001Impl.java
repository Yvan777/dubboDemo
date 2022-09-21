package provider.impl;

import Interface.TestInterface_001;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0",stub = "Interface.Stub.TestProvider001Stub",methods = {
        //注解真牛 单独对某个方法进行配置
		@Method(name = "test_001")
})
public class TestProvider001Impl implements TestInterface_001 {

	@Override
	public String test_001(String id) {
		System.out.println("=======provider001-in=======");
		return "test001Success" + id;
	}
}