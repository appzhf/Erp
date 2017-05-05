package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 采购材料信息类
 */
public class Material_cg implements Serializable, Cloneable,
		Comparable<Material_cg> {
	String Material_cg_orderId;// 下单编号
	String Material_cg_products;// 所属产品
	int Material_cg_id;// 序号
	String Material_cg_code;// 物料代码
	String Material_cg_name;// 物料名称
	String Material_cg_department;// 所属部门
	String Material_cg_store_address;// 仓库存放位置
	int Material_cg_needNumber;// 所需数量
	int Material_cg_allNumber;// 项目合计数量
	int Material_cg_inventoryNumber;// 库存数量
	int Material_cg_virtualNumber;// 虚拟库存数量
	String Material_cg_nowState;// 当前状态
	String Material_cg_creatTime;// 创建时间
	String Material_cg_bz;// 备注
	String Material_cg_bs;// bs
	boolean Material_cg_isSelected;// 是否选中
	String Material_cg_specifications;// 规格型号

	public Material_cg() {
	}

	public Material_cg(String material_cg_orderId, String material_cg_products,
			int material_cg_id, String material_cg_code,
			String material_cg_name, String material_cg_department,
			String material_cg_store_address, int material_cg_needNumber,
			int material_cg_allNumber, int material_cg_inventoryNumber,
			int material_cg_virtualNumber, String material_cg_nowState,
			String material_cg_creatTime, String material_cg_bz,
			String material_cg_bs, boolean material_cg_isSelected,
			String material_cg_specifications) {
		super();
		this.setMaterial_cg_orderId(material_cg_orderId);
		this.setMaterial_cg_products(material_cg_products);
		this.setMaterial_cg_id(material_cg_id);
		this.setMaterial_cg_code(material_cg_code);
		this.setMaterial_cg_name(material_cg_name);
		this.setMaterial_cg_department(material_cg_department);
		this.setMaterial_cg_store_address(material_cg_store_address);
		this.setMaterial_cg_needNumber(material_cg_needNumber);
		this.setMaterial_cg_allNumber(material_cg_allNumber);
		this.setMaterial_cg_inventoryNumber(material_cg_inventoryNumber);
		this.setMaterial_cg_virtualNumber(material_cg_virtualNumber);
		this.setMaterial_cg_nowState(material_cg_nowState);
		this.setMaterial_cg_creatTime(material_cg_creatTime);
		this.setMaterial_cg_bz(material_cg_bz);
		this.setMaterial_cg_bs(material_cg_bs);
		this.setMaterial_cg_isSelected(material_cg_isSelected);
		this.setMaterial_cg_specifications(material_cg_specifications);
	}

	public String getMaterial_cg_orderId() {
		return Material_cg_orderId;
	}

	public void setMaterial_cg_orderId(String material_cg_orderId) {
		Material_cg_orderId = material_cg_orderId;
	}

	public String getMaterial_cg_products() {
		return Material_cg_products;
	}

	public void setMaterial_cg_products(String material_cg_products) {
		Material_cg_products = material_cg_products;
	}

	public int getMaterial_cg_id() {
		return Material_cg_id;
	}

	public void setMaterial_cg_id(int material_cg_id) {
		Material_cg_id = material_cg_id;
	}

	public String getMaterial_cg_code() {
		return Material_cg_code;
	}

	public void setMaterial_cg_code(String material_cg_code) {
		Material_cg_code = material_cg_code;
	}

	public String getMaterial_cg_name() {
		return Material_cg_name;
	}

	public void setMaterial_cg_name(String material_cg_name) {
		Material_cg_name = material_cg_name;
	}

	public String getMaterial_cg_department() {
		return Material_cg_department;
	}

	public void setMaterial_cg_department(String material_cg_department) {
		Material_cg_department = material_cg_department;
	}

	public String getMaterial_cg_store_address() {
		return Material_cg_store_address;
	}

	public void setMaterial_cg_store_address(String material_cg_store_address) {
		Material_cg_store_address = material_cg_store_address;
	}

	public int getMaterial_cg_needNumber() {
		return Material_cg_needNumber;
	}

	public void setMaterial_cg_needNumber(int material_cg_needNumber) {
		Material_cg_needNumber = material_cg_needNumber;
	}

	public int getMaterial_cg_allNumber() {
		return Material_cg_allNumber;
	}

	public void setMaterial_cg_allNumber(int material_cg_allNumber) {
		Material_cg_allNumber = material_cg_allNumber;
	}

	public int getMaterial_cg_inventoryNumber() {
		return Material_cg_inventoryNumber;
	}

	public void setMaterial_cg_inventoryNumber(int material_cg_inventoryNumber) {
		Material_cg_inventoryNumber = material_cg_inventoryNumber;
	}

	public int getMaterial_cg_virtualNumber() {
		return Material_cg_virtualNumber;
	}

	public void setMaterial_cg_virtualNumber(int material_cg_virtualNumber) {
		Material_cg_virtualNumber = material_cg_virtualNumber;
	}

	public String getMaterial_cg_nowState() {
		return Material_cg_nowState;
	}

	public void setMaterial_cg_nowState(String material_cg_nowState) {
		Material_cg_nowState = material_cg_nowState;
	}

	public String getMaterial_cg_creatTime() {
		return Material_cg_creatTime;
	}

	public void setMaterial_cg_creatTime(String material_cg_creatTime) {
		Material_cg_creatTime = material_cg_creatTime;
	}

	public String getMaterial_cg_bz() {
		return Material_cg_bz;
	}

	public void setMaterial_cg_bz(String material_cg_bz) {
		Material_cg_bz = material_cg_bz;
	}

	public String getMaterial_cg_bs() {
		return Material_cg_bs;
	}

	public void setMaterial_cg_bs(String material_cg_bs) {
		Material_cg_bs = material_cg_bs;
	}

	public boolean isMaterial_cg_isSelected() {
		return Material_cg_isSelected;
	}

	public void setMaterial_cg_isSelected(boolean material_cg_isSelected) {
		Material_cg_isSelected = material_cg_isSelected;
	}

	public String getMaterial_cg_specifications() {
		return Material_cg_specifications;
	}

	public void setMaterial_cg_specifications(String material_cg_specifications) {
		Material_cg_specifications = material_cg_specifications;
	}

	@Override
	public String toString() {
		return "Material_cg [Material_cg_orderId=" + Material_cg_orderId
				+ ", Material_cg_products=" + Material_cg_products
				+ ", Material_cg_id=" + Material_cg_id + ", Material_cg_code="
				+ Material_cg_code + ", Material_cg_name=" + Material_cg_name
				+ ", Material_cg_department=" + Material_cg_department
				+ ", Material_cg_store_address=" + Material_cg_store_address
				+ ", Material_cg_needNumber=" + Material_cg_needNumber
				+ ", Material_cg_allNumber=" + Material_cg_allNumber
				+ ", Material_cg_inventoryNumber="
				+ Material_cg_inventoryNumber + ", Material_cg_virtualNumber="
				+ Material_cg_virtualNumber + ", Material_cg_nowState="
				+ Material_cg_nowState + ", Material_cg_creatTime="
				+ Material_cg_creatTime + ", Material_cg_bz=" + Material_cg_bz
				+ ", Material_cg_bs=" + Material_cg_bs
				+ ", Material_cg_isSelected=" + Material_cg_isSelected
				+ ", Material_cg_specifications=" + Material_cg_specifications
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Material_cg_allNumber;
		result = prime * result
				+ ((Material_cg_bs == null) ? 0 : Material_cg_bs.hashCode());
		result = prime * result
				+ ((Material_cg_bz == null) ? 0 : Material_cg_bz.hashCode());
		result = prime
				* result
				+ ((Material_cg_code == null) ? 0 : Material_cg_code.hashCode());
		result = prime
				* result
				+ ((Material_cg_creatTime == null) ? 0 : Material_cg_creatTime
						.hashCode());
		result = prime
				* result
				+ ((Material_cg_department == null) ? 0
						: Material_cg_department.hashCode());
		result = prime * result + Material_cg_id;
		result = prime * result + Material_cg_inventoryNumber;
		result = prime * result + (Material_cg_isSelected ? 1231 : 1237);
		result = prime
				* result
				+ ((Material_cg_name == null) ? 0 : Material_cg_name.hashCode());
		result = prime * result + Material_cg_needNumber;
		result = prime
				* result
				+ ((Material_cg_nowState == null) ? 0 : Material_cg_nowState
						.hashCode());
		result = prime
				* result
				+ ((Material_cg_orderId == null) ? 0 : Material_cg_orderId
						.hashCode());
		result = prime
				* result
				+ ((Material_cg_products == null) ? 0 : Material_cg_products
						.hashCode());
		result = prime
				* result
				+ ((Material_cg_specifications == null) ? 0
						: Material_cg_specifications.hashCode());
		result = prime
				* result
				+ ((Material_cg_store_address == null) ? 0
						: Material_cg_store_address.hashCode());
		result = prime * result + Material_cg_virtualNumber;
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
		Material_cg other = (Material_cg) obj;
		if (Material_cg_allNumber != other.Material_cg_allNumber)
			return false;
		if (Material_cg_bs == null) {
			if (other.Material_cg_bs != null)
				return false;
		} else if (!Material_cg_bs.equals(other.Material_cg_bs))
			return false;
		if (Material_cg_bz == null) {
			if (other.Material_cg_bz != null)
				return false;
		} else if (!Material_cg_bz.equals(other.Material_cg_bz))
			return false;
		if (Material_cg_code == null) {
			if (other.Material_cg_code != null)
				return false;
		} else if (!Material_cg_code.equals(other.Material_cg_code))
			return false;
		if (Material_cg_creatTime == null) {
			if (other.Material_cg_creatTime != null)
				return false;
		} else if (!Material_cg_creatTime.equals(other.Material_cg_creatTime))
			return false;
		if (Material_cg_department == null) {
			if (other.Material_cg_department != null)
				return false;
		} else if (!Material_cg_department.equals(other.Material_cg_department))
			return false;
		if (Material_cg_id != other.Material_cg_id)
			return false;
		if (Material_cg_inventoryNumber != other.Material_cg_inventoryNumber)
			return false;
		if (Material_cg_isSelected != other.Material_cg_isSelected)
			return false;
		if (Material_cg_name == null) {
			if (other.Material_cg_name != null)
				return false;
		} else if (!Material_cg_name.equals(other.Material_cg_name))
			return false;
		if (Material_cg_needNumber != other.Material_cg_needNumber)
			return false;
		if (Material_cg_nowState == null) {
			if (other.Material_cg_nowState != null)
				return false;
		} else if (!Material_cg_nowState.equals(other.Material_cg_nowState))
			return false;
		if (Material_cg_orderId == null) {
			if (other.Material_cg_orderId != null)
				return false;
		} else if (!Material_cg_orderId.equals(other.Material_cg_orderId))
			return false;
		if (Material_cg_products == null) {
			if (other.Material_cg_products != null)
				return false;
		} else if (!Material_cg_products.equals(other.Material_cg_products))
			return false;
		if (Material_cg_specifications == null) {
			if (other.Material_cg_specifications != null)
				return false;
		} else if (!Material_cg_specifications
				.equals(other.Material_cg_specifications))
			return false;
		if (Material_cg_store_address == null) {
			if (other.Material_cg_store_address != null)
				return false;
		} else if (!Material_cg_store_address
				.equals(other.Material_cg_store_address))
			return false;
		if (Material_cg_virtualNumber != other.Material_cg_virtualNumber)
			return false;
		return true;
	}

	public int compareTo(Material_cg o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
