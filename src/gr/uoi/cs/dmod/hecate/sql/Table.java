package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class Table {
	String name;
	TreeMap<String, Attribute> attrs;
	Key pKey;
	Key fKey;
	
	// --Constructors--
	public Table(String n, TreeMap<String, Attribute> a, Key p) {
		this.name = n;
		this.attrs = a;
		this.pKey = p;
		this.fKey = null;
	}
	
	public Table(String n, TreeMap<String, Attribute> a, Key p, Key f) {
		this.name = n;
		this.attrs = a;
		this.pKey = p;
		this.fKey = f;
	}
	
	// --Getters--
	public String getName() {
		return this.name;
	}
	
	public TreeMap<String, Attribute> getAttrs() {
		return this.attrs;
	}
	
	public Key getpKey() {
		return this.pKey;
	}
	
	public Key getfKey() {
		return this.fKey;
	}
	
	public String toString() {
		String buff = new String();
		buff = "Table: " + this.name + "\n";
		for (Map.Entry<String, Attribute> entry : this.attrs.entrySet()) {
			Attribute a = entry.getValue();
			buff += a.toString() + "\n";
		}
		return buff;
	}
}
