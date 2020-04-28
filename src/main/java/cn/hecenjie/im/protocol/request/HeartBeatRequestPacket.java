package cn.hecenjie.im.protocol.request;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
