package com.dukl.web.user.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
public class GoodsEntity {

    private String gId;

    private String gName;

    private Date birthdate;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
