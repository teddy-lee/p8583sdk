package com.denovo.p8583;

import java.util.Arrays;

/**
 * Created by moonwa on 15-1-14.
 */
public class BinaryFixLengthP8583Item extends P8583Item {
    private int length;

    public BinaryFixLengthP8583Item(int length) {
        this.length = length;
    }

    @Override
    public int writeData(byte[] bytes, int ptr) {
        int len = this.length;
        int actual_len = len;
        // 跳过自动补0
        if(len % 2 == 1){
            actual_len = actual_len +1;
        }

        actual_len = actual_len / 2;

        byte[] data = Arrays.copyOfRange(bytes, ptr, ptr + actual_len / 2);
        data = Encoder.fromBcds(data);

        if(len % 2 == 1){
            data = Arrays.copyOfRange(data, 1, data.length);
        }
        this.setData(data);

        return actual_len / 2;
    }
}
