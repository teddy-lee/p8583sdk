package com.denovo.p8583server;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

/**
 * Created by 013495 on 2015/1/14.
 */
public class P583CodeEncoder implements ProtocolEncoder {
    public P583CodeEncoder(IoSession session) {
    }

    public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception {

    }

    public void dispose(IoSession session) throws Exception {

    }
}