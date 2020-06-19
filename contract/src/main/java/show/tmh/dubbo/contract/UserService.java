package show.tmh.dubbo.contract;


import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(String userId);

    List<UserAddress> getUserAddressList1(String userId);
}
