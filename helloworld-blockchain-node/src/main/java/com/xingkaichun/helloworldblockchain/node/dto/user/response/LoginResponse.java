package com.xingkaichun.helloworldblockchain.node.dto.user.response;

import com.xingkaichun.helloworldblockchain.node.dto.user.UserDto;

/**
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public class LoginResponse {

    private UserDto userDto;



    //region get set

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    //endregion
}
