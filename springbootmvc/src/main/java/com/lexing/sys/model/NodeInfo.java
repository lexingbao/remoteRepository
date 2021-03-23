package com.lexing.sys.model;

import java.util.Date;

public class NodeInfo implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	private Long id; //����
	private String nodeCode;
	private String nodeName;
	private Integer nodeOrder;
	private String nodeType;
	private String typeName;
	private String remark;
	private Date createTime;
	private Date modifyTime;
	private String createUser;
	private String modifyUser;
	private Integer property;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeCode() {
		return nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getNodeOrder() {
		return nodeOrder;
	}

	public void setNodeOrder(Integer nodeOrder) {
		this.nodeOrder = nodeOrder;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Integer getProperty() {
		return property;
	}

	public void setProperty(Integer property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "NodeInfo{" +
				"nodeCode='" + nodeCode + '\'' +
				", nodeName='" + nodeName + '\'' +
				", nodeOrder=" + nodeOrder +
				", nodeType='" + nodeType + '\'' +
				", typeName='" + typeName + '\'' +
				", remark='" + remark + '\'' +
				", createTime=" + createTime +
				", modifyTime=" + modifyTime +
				", createUser='" + createUser + '\'' +
				", modifyUser='" + modifyUser + '\'' +
				", property=" + property +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NodeInfo nodeInfo = (NodeInfo) o;

		return nodeCode.equals(nodeInfo.nodeCode);
	}

	@Override
	public int hashCode() {
		return nodeCode.hashCode();
	}
}