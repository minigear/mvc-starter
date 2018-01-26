package net.ujacha.hot.mvcstarter.namecard;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NameCard {

    private long id;
    private String name;
    private String phoneNumber;
    private String memo;

    public NameCard(long id, String name, String phonenumber, String memo) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phonenumber;
        this.memo = memo;
    }

    public NameCard(long id) {
        this(id, null, null, null);
    }

    public NameCard() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
