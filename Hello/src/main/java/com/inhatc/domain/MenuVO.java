package com.inhatc.domain;

public class MenuVO {
	private int menuid;
	private String menu;
	private String menuname;
	private int price;
	
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuVO [menuid=" + menuid + ", menu=" + menu + ", menuname=" + menuname + ", price=" + price + "]";
	}
	public MenuVO(int menuid, String menu, String menuname, int price) {
		super();
		this.menuid = menuid;
		this.menu = menu;
		this.menuname = menuname;
		this.price = price;
	}
	public MenuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
