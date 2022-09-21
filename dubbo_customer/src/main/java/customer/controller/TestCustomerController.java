package customer.controller;

import Interface.TestInterface_001;
import Interface.TestInterface_002;
import Interface.TestInterface_777;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author yvan
 * @CreateDate 2022/4/7 4:34 下午
 */
@RestController
@RequestMapping("/testCustomer")
public class TestCustomerController {

    @DubboReference(version = "1.0")
    TestInterface_777 testInterface_777;

    @DubboReference(version = "1.0")
    TestInterface_001 testInterface_001;

    @DubboReference(version = "1.0")
    TestInterface_002 testInterface_002;

    @RequestMapping("/api777")
    public String api777(){
        System.out.println("=======customer-api777-in=======");
        return testInterface_777.test_777();
    }

    @RequestMapping(value = "/api001/{id}")
    public String api001(@PathVariable String id){
        System.out.println("=======customer-api001-in=======");
        return testInterface_001.test_001(id);
    }

    @RequestMapping(value = "/api001")
    public String api001(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("=======customer-api001-in=======");
        return testInterface_001.test_001(id);
    }

    @RequestMapping("/api002")
    public String api002(){
        System.out.println("=======customer-api002-in=======");
        return testInterface_002.test_002();
    }

}
