package provider.impl;

import Interface.TestInterface_777;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0")
public class TestProvider777Impl implements TestInterface_777 {

	@Override
	public String test_777() {
		System.out.println("=======provider777-in=======");
		return "test777Success";
	}
}