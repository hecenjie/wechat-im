package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.MESSAGE_RESPONSE;

public class MessageResponsePacket extends Packet {
    private String fromUserId;

    private String fromUsername;

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
