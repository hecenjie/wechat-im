package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.LOGIN_RESPONSE;

public class LoginResponsePacket extends Packet {

    private String userId;

    private String username;

    private boolean success;

    private String errMsg;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
