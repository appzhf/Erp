package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品信息类
 */
public class Product_name implements Serializable, Cloneable,
		Comparable<Product_name> {

	String Product_name_id;// 产品编号
	String Product_name_name;// 产品名称
	String Product_name_bz;// 备注

	public Product_name() {
		super();
	}

	public Product_name(String product_name_id, String product_name_name,
			String product_name_bz) {
		super();
		this.setProduct_name_id(product_name_id);
		this.setProduct_name_name(product_name_name);
		this.setProduct_name_bz(product_name_bz);
	}

	public String getProduct_name_id() {
		return Product_name_id;
	}

	public void setProduct_name_id(String product_name_id) {
		Product_name_id = product_name_id;
	}

	public String getProduct_name_name() {
		return Product_name_name;
	}

	public void setProduct_name_name(String product_name_name) {
		Product_name_name = product_name_name;
	}

	public String getProduct_name_bz() {
		return Product_name_bz;
	}

	public void setProduct_name_bz(String product_name_bz) {
		Product_name_bz = product_name_bz;
	}

	@Override
	public String toString() {
		return "Product_name [Product_name_id=" + Product_name_id
				+ ", Product_name_name=" + Product_name_name
				+ ", Product_name_bz=" + Product_name_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Product_name_bz == null) ? 0 : Product_name_bz.hashCode());
		result = prime * result
				+ ((Product_name_id == null) ? 0 : Product_name_id.hashCode());
		result = prime
				* result
				+ ((Product_name_name == null) ? 0 : Product_name_name
						.hashCode());
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
		Product_name other = (Product_name) obj;
		if (Product_name_bz == null) {
			if (other.Product_name_bz != null)
				return false;
		} else if (!Product_name_bz.equals(other.Product_name_bz))
			return false;
		if (Product_name_id == null) {
			if (other.Product_name_id != null)
				return false;
		} else if (!Product_name_id.equals(other.Product_name_id))
			return false;
		if (Product_name_name == null) {
			if (other.Product_name_name != null)
				return false;
		} else if (!Product_name_name.equals(other.Product_name_name))
			return false;
		return true;
	}

	public int compareTo(Product_name o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
