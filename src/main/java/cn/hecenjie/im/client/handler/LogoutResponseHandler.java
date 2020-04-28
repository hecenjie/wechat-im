package cn.hecenjie.im.client.handler;

import cn.hecenjie.im.protocol.response.LogoutResponsePacket;
import cn.hecenjie.im.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class LogoutResponseHandler extends SimpleChannelInboundHandler<LogoutResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutResponsePacket logoutResponsePacket) {
        SessionUtil.unbindSession(ctx.channel());
    }
}