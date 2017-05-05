package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品分类信息
 */
public class Product_class implements Serializable, Cloneable,
		Comparable<Product_class> {

	String Product_class_id;// 产品编号
	String Product_class_code;// 产品代码
	String Product_class_name;// 产品名称
	String Product_class_classific;// 部件分类
	String Product_class_attributeName;// 属性名称
	boolean Product_class_isDefault;// 是否默认
	String Product_class_bz;// 备注

	public Product_class() {
		super();
	}

	public Product_class(String product_class_id, String product_class_code,
			String product_class_name, String product_class_classific,
			String product_class_attributeName,
			boolean product_class_isDefault, String product_class_bz) {
		super();
		this.setProduct_class_id(product_class_id);
		this.setProduct_class_code(product_class_code);
		this.setProduct_class_name(product_class_name);
		this.setProduct_class_classific(product_class_classific);
		this.setProduct_class_attributeName(product_class_attributeName);
		this.setProduct_class_isDefault(product_class_isDefault);
		this.setProduct_class_bz(product_class_bz);
	}

	public String getProduct_class_id() {
		return Product_class_id;
	}

	public void setProduct_class_id(String product_class_id) {
		Product_class_id = product_class_id;
	}

	public String getProduct_class_code() {
		return Product_class_code;
	}

	public void setProduct_class_code(String product_class_code) {
		Product_class_code = product_class_code;
	}

	public String getProduct_class_name() {
		return Product_class_name;
	}

	public void setProduct_class_name(String product_class_name) {
		Product_class_name = product_class_name;
	}

	public String getProduct_class_classific() {
		return Product_class_classific;
	}

	public void setProduct_class_classific(String product_class_classific) {
		Product_class_classific = product_class_classific;
	}

	public String getProduct_class_attributeName() {
		return Product_class_attributeName;
	}

	public void setProduct_class_attributeName(
			String product_class_attributeName) {
		Product_class_attributeName = product_class_attributeName;
	}

	public boolean isProduct_class_isDefault() {
		return Product_class_isDefault;
	}

	public void setProduct_class_isDefault(boolean product_class_isDefault) {
		Product_class_isDefault = product_class_isDefault;
	}

	public String getProduct_class_bz() {
		return Product_class_bz;
	}

	public void setProduct_class_bz(String product_class_bz) {
		Product_class_bz = product_class_bz;
	}

	@Override
	public String toString() {
		return "Product_class [Product_class_id=" + Product_class_id
				+ ", Product_class_code=" + Product_class_code
				+ ", Product_class_name=" + Product_class_name
				+ ", Product_class_classific=" + Product_class_classific
				+ ", Product_class_attributeName="
				+ Product_class_attributeName + ", Product_class_isDefault="
				+ Product_class_isDefault + ", Product_class_bz="
				+ Product_class_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Product_class_attributeName == null) ? 0
						: Product_class_attributeName.hashCode());
		result = prime
				* result
				+ ((Product_class_bz == null) ? 0 : Product_class_bz.hashCode());
		result = prime
				* result
				+ ((Product_class_classific == null) ? 0
						: Product_class_classific.hashCode());
		result = prime
				* result
				+ ((Product_class_code == null) ? 0 : Product_class_code
						.hashCode());
		result = prime
				* result
				+ ((Product_class_id == null) ? 0 : Product_class_id.hashCode());
		result = prime * result + (Product_class_isDefault ? 1231 : 1237);
		result = prime
				* result
				+ ((Product_class_name == null) ? 0 : Product_class_name
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
		Product_class other = (Product_class) obj;
		if (Product_class_attributeName == null) {
			if (other.Product_class_attributeName != null)
				return false;
		} else if (!Product_class_attributeName
				.equals(other.Product_class_attributeName))
			return false;
		if (Product_class_bz == null) {
			if (other.Product_class_bz != null)
				return false;
		} else if (!Product_class_bz.equals(other.Product_class_bz))
			return false;
		if (Product_class_classific == null) {
			if (other.Product_class_classific != null)
				return false;
		} else if (!Product_class_classific
				.equals(other.Product_class_classific))
			return false;
		if (Product_class_code == null) {
			if (other.Product_class_code != null)
				return false;
		} else if (!Product_class_code.equals(other.Product_class_code))
			return false;
		if (Product_class_id == null) {
			if (other.Product_class_id != null)
				return false;
		} else if (!Product_class_id.equals(other.Product_class_id))
			return false;
		if (Product_class_isDefault != other.Product_class_isDefault)
			return false;
		if (Product_class_name == null) {
			if (other.Product_class_name != null)
				return false;
		} else if (!Product_class_name.equals(other.Product_class_name))
			return false;
		return true;
	}

	public int compareTo(Product_class o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
