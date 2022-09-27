package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FDRole")
public class FDRole {
	
	@Id
	@Column(name="role_id")
	private int role_id;
	
	@Column(name="roleName")
	private String roleName;
	
	@Column(name="order_food")
	private boolean order_food;
	
	@Column(name="customer_signup")
	private boolean customer_signup;
	
	@Column(name="rt_admin_signup")
	private boolean rt_admin_signup;
	
	@Column(name="search_rest")
	private boolean search_rest;
	
	@Column(name="search_menu")
	private boolean search_menu;
	
	@Column(name="approve_rt_admin")
	private boolean approve_rt_admin;
	
	@Column(name="da_signup")
	private boolean da_signup;
	
	@Column(name="approve_da")
	private boolean approve_da;
	
	@Column(name="rate_da")
	private boolean rate_da;
	
	@Column(name="rate_rest")
	private boolean rate_rest;
	
	@Column(name="accept_order_deliver")
	private boolean accept_order_deliver;
	
	public FDRole() {
		
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isOrder_food() {
		return order_food;
	}

	public void setOrder_food(boolean order_food) {
		this.order_food = order_food;
	}

	public boolean isCustomer_signup() {
		return customer_signup;
	}

	public void setCustomer_signup(boolean customer_signup) {
		this.customer_signup = customer_signup;
	}

	public boolean isRt_admin_signup() {
		return rt_admin_signup;
	}

	public void setRt_admin_signup(boolean rt_admin_signup) {
		this.rt_admin_signup = rt_admin_signup;
	}

	public boolean isSearch_rest() {
		return search_rest;
	}

	public void setSearch_rest(boolean search_rest) {
		this.search_rest = search_rest;
	}

	public boolean isSearch_menu() {
		return search_menu;
	}

	public void setSearch_menu(boolean search_menu) {
		this.search_menu = search_menu;
	}

	public boolean isApprove_rt_admin() {
		return approve_rt_admin;
	}

	public void setApprove_rt_admin(boolean approve_rt_admin) {
		this.approve_rt_admin = approve_rt_admin;
	}

	public boolean isDa_signup() {
		return da_signup;
	}

	public void setDa_signup(boolean da_signup) {
		this.da_signup = da_signup;
	}

	public boolean isApprove_da() {
		return approve_da;
	}

	public void setApprove_da(boolean approve_da) {
		this.approve_da = approve_da;
	}

	public boolean isRate_da() {
		return rate_da;
	}

	public void setRate_da(boolean rate_da) {
		this.rate_da = rate_da;
	}

	public boolean isRate_rest() {
		return rate_rest;
	}

	public void setRate_rest(boolean rate_rest) {
		this.rate_rest = rate_rest;
	}

	public boolean isAccept_order_deliver() {
		return accept_order_deliver;
	}

	public void setAccept_order_deliver(boolean accept_order_deliver) {
		this.accept_order_deliver = accept_order_deliver;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accept_order_deliver ? 1231 : 1237);
		result = prime * result + (approve_da ? 1231 : 1237);
		result = prime * result + (approve_rt_admin ? 1231 : 1237);
		result = prime * result + (customer_signup ? 1231 : 1237);
		result = prime * result + (da_signup ? 1231 : 1237);
		result = prime * result + (order_food ? 1231 : 1237);
		result = prime * result + (rate_da ? 1231 : 1237);
		result = prime * result + (rate_rest ? 1231 : 1237);
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + role_id;
		result = prime * result + (rt_admin_signup ? 1231 : 1237);
		result = prime * result + (search_menu ? 1231 : 1237);
		result = prime * result + (search_rest ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FDRole other = (FDRole) obj;
		if (accept_order_deliver != other.accept_order_deliver)
			return false;
		if (approve_da != other.approve_da)
			return false;
		if (approve_rt_admin != other.approve_rt_admin)
			return false;
		if (customer_signup != other.customer_signup)
			return false;
		if (da_signup != other.da_signup)
			return false;
		if (order_food != other.order_food)
			return false;
		if (rate_da != other.rate_da)
			return false;
		if (rate_rest != other.rate_rest)
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (role_id != other.role_id)
			return false;
		if (rt_admin_signup != other.rt_admin_signup)
			return false;
		if (search_menu != other.search_menu)
			return false;
		if (search_rest != other.search_rest)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FDRole [role_id=" + role_id + ", roleName=" + roleName + ", order_food=" + order_food
				+ ", customer_signup=" + customer_signup + ", rt_admin_signup=" + rt_admin_signup + ", search_rest="
				+ search_rest + ", search_menu=" + search_menu + ", approve_rt_admin=" + approve_rt_admin
				+ ", da_signup=" + da_signup + ", approve_da=" + approve_da + ", rate_da=" + rate_da + ", rate_rest="
				+ rate_rest + ", accept_order_deliver=" + accept_order_deliver + "]";
	}

	public FDRole(int role_id, String roleName, boolean order_food, boolean customer_signup, boolean rt_admin_signup,
			boolean search_rest, boolean search_menu, boolean approve_rt_admin, boolean da_signup, boolean approve_da,
			boolean rate_da, boolean rate_rest, boolean accept_order_deliver) {
		super();
		this.role_id = role_id;
		this.roleName = roleName;
		this.order_food = order_food;
		this.customer_signup = customer_signup;
		this.rt_admin_signup = rt_admin_signup;
		this.search_rest = search_rest;
		this.search_menu = search_menu;
		this.approve_rt_admin = approve_rt_admin;
		this.da_signup = da_signup;
		this.approve_da = approve_da;
		this.rate_da = rate_da;
		this.rate_rest = rate_rest;
		this.accept_order_deliver = accept_order_deliver;
	}
	
	
	

}
