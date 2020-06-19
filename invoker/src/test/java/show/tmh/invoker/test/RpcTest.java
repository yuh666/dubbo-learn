package show.tmh.invoker.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import show.tmh.invoker.RpcClients;

@SpringBootTest
public class RpcTest {

    @Autowired
    private RpcClients rpcClients;

    @Test
    public void testUserService(){
        System.out.println(rpcClients.getUserService().getUserAddressList(""));
    }
}
