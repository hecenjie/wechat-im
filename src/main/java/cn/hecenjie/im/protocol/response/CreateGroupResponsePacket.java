package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import java.util.List;

import static cn.hecenjie.im.protocol.Command.CREATE_GROUP_RESPONSE;

public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> usernameList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_RESPONSE;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(List<String> usernameList) {
        this.usernameList = usernameList;
    }
}
