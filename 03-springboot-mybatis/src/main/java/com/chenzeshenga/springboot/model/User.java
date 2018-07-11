package com.chenzeshenga.springboot.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -5176336931556421215L;

	private String grantee;

	private String tableCatalog;

	private String privilegeType;

	private String isGrantable;

	public String getGrantee() {
		return grantee;
	}

	public void setGrantee(String grantee) {
		this.grantee = grantee;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getPrivilegeType() {
		return privilegeType;
	}

	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}

	public String getIsGrantable() {
		return isGrantable;
	}

	public void setIsGrantable(String isGrantable) {
		this.isGrantable = isGrantable;
	}
}