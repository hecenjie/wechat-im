package cn.hecenjie.im.util;

import cn.hecenjie.im.Attributes;
import cn.hecenjie.im.Session;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SessionUtil {
    /** userId -> channel */
    private static final Map<String, Channel> userIdChannelMap = new ConcurrentHashMap<>();
    /** groupId -> channels */
    private static final Map<String, ChannelGroup> groupIdChannelGroupMap = new ConcurrentHashMap<>();

    public static void bindSession(Session session, Channel channel) {
        channel.attr(Attributes.SESSION).set(session);
        userIdChannelMap.put(session.getUserId(), channel);
    }

    public static void unbindSession(Channel channel) {
        if (hasLogin(channel)) {
            channel.attr(Attributes.SESSION).set(null);
            Session session = getSession(channel);
            userIdChannelMap.remove(session.getUserId());
            System.out.println(session + " 退出登录");
        }
    }

    public static boolean hasLogin(Channel channel) {
        return getSession(channel) != null;
    }

    public static Session getSession(Channel channel) {
        return channel.attr(Attributes.SESSION).get();
    }

    public static Channel getChannel(String userId) {
        return userIdChannelMap.get(userId);
    }

    public static void bindChannelGroup(String groupId, ChannelGroup channelGroup) {
        groupIdChannelGroupMap.put(groupId, channelGroup);
    }

    public static ChannelGroup getChannelGroup(String groupId) {
        return groupIdChannelGroupMap.get(groupId);
    }
}
