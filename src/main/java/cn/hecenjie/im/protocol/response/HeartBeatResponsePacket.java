package cn.hecenjie.im.protocol.response;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }

}
