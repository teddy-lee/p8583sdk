package com.denovo.p8583server.requestMessages;

/**
 * Created by Administrator on 2015/2/9.
 */
public class SignInOutRequestMessage extends DefaultRequestMessage {
    private String userName;
    private String password;
    private String serialNo;
    private String batchNo;
    private String mac;

    public SignInOutRequestMessage(String messageType, byte[] tpud) {
        super(messageType, tpud);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}

