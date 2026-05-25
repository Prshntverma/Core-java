package com.rays.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public transient int id;
	public String name;

	// Mandatory default constructor
	public Employee() {

	}

	public Employee(int a, String b) {

		this.id = a;
		this.name = b;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		id = in.readInt();
		name = (String) in.readObject();

	}

	public String toString() {
		return "id: " + id + " name: " + name;
	}

}