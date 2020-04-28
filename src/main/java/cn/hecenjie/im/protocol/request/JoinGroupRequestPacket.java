package cn.hecenjie.im.protocol.request;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.JOIN_GROUP_REQUEST;

public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
