
package com.coding.map;
/**
 * @author Naveen K Wodeyar LENOVO
 * @date 03-Jun-202411:10:09 pm
 * @classDef, 
 */

import java.util.*;

public class Institute {
	
	private String instName;
	private List<String> instAddress;
	
	/**
	 * @param instName
	 * @param instAddress
	 */
	public Institute(String instName, List<String> instAddress) {
		super();
		this.instName = instName;
		this.instAddress = instAddress;
	}
	@Override
	public String toString() {
		return "Institute [instName=" + instName + ", instAddress=" + instAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(instAddress, instName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Institute other = (Institute) obj;
		return Objects.equals(instAddress, other.instAddress) && Objects.equals(instName, other.instName);
	}
	/**
	 * @return the instName
	 */
	public String getInstName() {
		return instName;
	}
	/**
	 * @param instName the instName to set
	 */
	public void setInstName(String instName) {
		this.instName = instName;
	}
	/**
	 * @return the instAddress
	 */
	public List<String> getInstAddress() {
		return instAddress;
	}
	/**
	 * @param instAddress the instAddress to set
	 */
	public void setInstAddress(List<String> instAddress) {
		this.instAddress = instAddress;
	}


}
