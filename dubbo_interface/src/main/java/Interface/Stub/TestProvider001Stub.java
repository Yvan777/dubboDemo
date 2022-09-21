package Interface.Stub;

import Interface.TestInterface_001;

public class TestProvider001Stub implements TestInterface_001 {
	private final TestInterface_001 testInterface_001;

	public TestProvider001Stub(TestInterface_001 testInterface_001) {
		this.testInterface_001 = testInterface_001;
	}

	@Override
	public String test_001(String id) {
		System.out.println("=======provider001Stub-in=======");
		if ("777".equals(id)){
			return testInterface_001.test_001(id);
		}
		return "Request Parameter Error";
	}
}