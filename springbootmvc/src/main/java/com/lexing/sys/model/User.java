package com.lexing.sys.model;

import java.io.Serializable;


public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long              id;                   // 主键
    private String            name;                 // 用户名
    private Integer           sex;                  // 性别：0 - 未知 、 1 - 男 、 2 - 女
    private String            phone;                // 手机号
    private String            accountNo;            // 平台账号
    private String            nickname;             // 昵称
    private String            wchatHead;            // 头像url
    private String            wchatOpenId;          // 微信openId
    private String            wchatUnionid;         // 微信unionid
    private String            password;             // 密码
    private Integer           bind;                 // 是否绑卡：-1 - 绑卡失败、0 - 未绑卡、1 - 已绑卡
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getWchatHead() {
		return wchatHead;
	}
	public void setWchatHead(String wchatHead) {
		this.wchatHead = wchatHead;
	}
	public String getWchatOpenId() {
		return wchatOpenId;
	}
	public void setWchatOpenId(String wchatOpenId) {
		this.wchatOpenId = wchatOpenId;
	}
	public String getWchatUnionid() {
		return wchatUnionid;
	}
	public void setWchatUnionid(String wchatUnionid) {
		this.wchatUnionid = wchatUnionid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getBind() {
		return bind;
	}
	public void setBind(Integer bind) {
		this.bind = bind;
	}

    
    
    

}
