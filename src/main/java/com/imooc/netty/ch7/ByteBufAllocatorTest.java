package com.imooc.netty.ch7;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;

public class ByteBufAllocatorTest {

    public static void main(String[] args) {
        ByteBufAllocator allocator = new PooledByteBufAllocator();
        ByteBuf byteBuf = allocator.directBuffer(1);
        System.out.println(byteBuf.capacity());

    }
}
