package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.QUIT_GROUP_RESPONSE;

public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String errMsg;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
