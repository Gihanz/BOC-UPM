package com.boc.model;
// Generated Nov 17, 2016 3:47:44 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * RoleBase generated by hbm2java
 */
@Entity(name="com.boc.model.RoleBase")
@Table(name = "ROLE_BASE", schema = "WFCONFIG", uniqueConstraints = @UniqueConstraint(columnNames = "ROLE_NAME") )
public class RoleBase implements java.io.Serializable {

	private int rid;
	private String roleName;
	private String roleLabel;
	private String roleDescription;
	private Integer level;
	private Short editflag;

	public RoleBase() {
	}

	public RoleBase(int rid, String roleName, String roleLabel) {
		this.rid = rid;
		this.roleName = roleName;
		this.roleLabel = roleLabel;
	}

	public RoleBase(int rid, String roleName, String roleLabel, String roleDescription, Integer level, Short editflag) {
		this.rid = rid;
		this.roleName = roleName;
		this.roleLabel = roleLabel;
		this.roleDescription = roleDescription;
		this.level = level;
		this.editflag = editflag;
	}

	@Id

	@Column(name = "RID", unique = true, nullable = false)
	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	@Column(name = "ROLE_NAME", unique = true, nullable = false, length = 50)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "ROLE_LABEL", nullable = false, length = 50)
	public String getRoleLabel() {
		return this.roleLabel;
	}

	public void setRoleLabel(String roleLabel) {
		this.roleLabel = roleLabel;
	}

	@Column(name = "ROLE_DESCRIPTION", length = 50)
	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	@Column(name = "LEVEL")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "EDITFLAG")
	public Short getEditflag() {
		return this.editflag;
	}

	public void setEditflag(Short editflag) {
		this.editflag = editflag;
	}

}