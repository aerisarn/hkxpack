package com.dexesttp.hkxpack.xml.classxml.definition.members;

public class ImportedMember extends ClassXMLMember {
	private final String offset;
	private final String vtype;
	private final String vsubtype;
	private final String ctype;
	private final String etype;
	private final String flag;

	public ImportedMember(String name, String offset, String classname, String vtype, String vsubtype, String ctype, String etype, String flag) {
		super(name, classname);
		this.offset = offset;
		this.vtype = vtype;
		this.vsubtype = vsubtype;
		this.ctype = ctype;
		this.etype = etype;
		this.flag = flag;
	}
}
