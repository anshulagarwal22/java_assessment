package studentdetails;

public class Student {
	private Integer id;
	private String name;
	private int age;	
	private String Address;
	private String Branch;
	public Student() {
		super();
		}
	      ///constructor
		public Student(Integer id, String name,int age,String Address,String Branch) {
		super();
		this.id = id;
		this.name =name;
		this.age=age;
		this.Address = Address;
		this.Branch= Branch;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}


}
