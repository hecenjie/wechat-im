package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.LOGOUT_RESPONSE;

public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String errMsg;

    @Override
    public Byte getCommand() {
        return LOGOUT_RESPONSE;
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
