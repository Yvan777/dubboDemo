package provider.impl;

import Interface.TestInterface_002;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0")
public class TestProvider002Impl implements TestInterface_002 {

	@Override
	public String test_002() {
		System.out.println("=======provider002-in=======");
		return "test002Success";
	}
}