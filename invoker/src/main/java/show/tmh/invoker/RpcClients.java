package show.tmh.invoker;


import com.alibaba.dubbo.config.annotation.Reference;
import lombok.Getter;
import org.springframework.stereotype.Component;
import show.tmh.dubbo.contract.UserService;

@Component
@Getter
public class RpcClients {

    @Reference
    private UserService userService;
}
