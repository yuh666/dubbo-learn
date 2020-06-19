package show.tmh.dubbo.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {

    private Integer id;
    private String userAddress; // 用户地址
    private String userId; // 用户id
    private String consignee; // 收货人
    private String phoneNum; // 电话号码
    private String isDefault; // 是否为默认地址 yes / no

}
