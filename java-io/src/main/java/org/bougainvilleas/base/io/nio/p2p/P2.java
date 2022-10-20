package org.bougainvilleas.base.io.nio.p2p;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class P2 {

  public static void main(String[] args) {

    try(
            SocketChannel socketChannel = SocketChannel.open();
    ){
      InetSocketAddress address = new InetSocketAddress("127.0.0.1", 6666);
      socketChannel.configureBlocking(false);
      if(!socketChannel.connect(address)){
        while(!socketChannel.finishConnect()){
          System.err.println("连接需要时间，客户端不会阻塞，可以做其他工作");
        }
      }
      String msg="{\"ip\":\"127.0.0.1\",\"port\":6668}";
      ByteBuffer wrap = ByteBuffer.wrap(msg.getBytes(StandardCharsets.UTF_8));
      socketChannel.write(wrap);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
