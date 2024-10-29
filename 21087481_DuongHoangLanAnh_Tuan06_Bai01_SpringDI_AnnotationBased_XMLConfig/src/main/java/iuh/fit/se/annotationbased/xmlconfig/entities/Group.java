package iuh.fit.se.annotationbased.xmlconfig.entities;

public class Group {
	private int id;
	private String groupName;

	public Group() {
		super();
	}

	public Group(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Group(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + "]";
	}

	
}
