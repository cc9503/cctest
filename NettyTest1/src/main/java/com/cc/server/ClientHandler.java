package com.cc.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
//客户端逻辑处理
public class ClientHandler extends SimpleChannelInboundHandler<String>{

	@Override
    protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
        //打印服务端的发送数据
        System.out.println(s);
    }
}
