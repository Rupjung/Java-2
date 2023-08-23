package com.basicjava.fourteenthclass;

//child extends parent -- Inheritance
public class AbstractClassImp extends AbstractClassDemo{
	private int id;
	private String name;

	public AbstractClassImp(String name, int id){
		super(name,id);	//super refers parent class obj
	}
	@Override
	public void showData() {
		System.out.println("Id : "+super.id);
		System.out.println("Name : "+super.name);
		
	}

	@Override
	public String getData() {
		return "Id :"+id+"\n"+name;
	}

	@Override
	public void setData(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		
		AbstractClassImp obj = new AbstractClassImp("Rupjung",100);
		obj.setData(1, "Rupjung");
		obj.showData();
		
		//Inside the parent's class
		obj.showInfo();
	}
}
