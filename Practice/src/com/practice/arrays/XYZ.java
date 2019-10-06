package com.practice.arrays;

import java.util.Comparator;

public class XYZ implements Comparable<XYZ>, Comparator<XYZ> {

	int id;
	String name;
	
	
	public XYZ(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		XYZ other = (XYZ) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(XYZ o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

	@Override
	public int compare(XYZ o1, XYZ o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
