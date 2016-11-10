package com.common.oauth.model;

public class Sensor {
    private String sid;

    private String sNo;

    private String eId;

    private String sType;

    private Integer sStatus;

    private String yid;

    private String zid;

    private String hid;

    private String ocId;

    private String sAlias;

    private String sUrl;

    private Integer sSortId;

    private Long timestamp;

    private String sHisUrl;

    private String sValue;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo == null ? null : sNo.trim();
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId == null ? null : eId.trim();
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType == null ? null : sType.trim();
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid == null ? null : yid.trim();
    }

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid == null ? null : zid.trim();
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid == null ? null : hid.trim();
    }

    public String getOcId() {
        return ocId;
    }

    public void setOcId(String ocId) {
        this.ocId = ocId == null ? null : ocId.trim();
    }

    public String getsAlias() {
        return sAlias;
    }

    public void setsAlias(String sAlias) {
        this.sAlias = sAlias == null ? null : sAlias.trim();
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl == null ? null : sUrl.trim();
    }

    public Integer getsSortId() {
        return sSortId;
    }

    public void setsSortId(Integer sSortId) {
        this.sSortId = sSortId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getsHisUrl() {
        return sHisUrl;
    }

    public void setsHisUrl(String sHisUrl) {
        this.sHisUrl = sHisUrl == null ? null : sHisUrl.trim();
    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue == null ? null : sValue.trim();
    }
}