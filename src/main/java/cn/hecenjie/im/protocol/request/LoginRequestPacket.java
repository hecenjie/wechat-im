package cn.hecenjie.im.protocol.request;

import cn.hecenjie.im.protocol.Packet;

import static cn.hecenjie.im.protocol.Command.LOGIN_REQUEST;

public class LoginRequestPacket extends Packet {

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
