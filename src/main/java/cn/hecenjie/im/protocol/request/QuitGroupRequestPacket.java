package cn.hecenjie.im.protocol.request;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.QUIT_GROUP_REQUEST;

public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_REQUEST;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
