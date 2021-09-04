package com;

public class Order {
	private Integer id;
	private Integer userid;
	private Integer tid;
	private double total;	
	private String promo;
	private double discount;
	private int status;
	private String CreatedAt;
	private String ModifiedAt;
	
	public Order() {
		super();
		}
	      ///constructor
		public Order(Integer id, Integer userid, Integer tid,double total , String promo , double discount , int status , String ModifiedAt,String CreatedAt) {
		super();
		this.id = id;
		this.userid= userid;
		this.tid = tid;
		this.total=total;
		this.promo = promo;
		this.discount= discount;
		this.status=status;
		this.ModifiedAt=ModifiedAt;
		this.CreatedAt=CreatedAt;
		}
		
	
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public Integer getTid() {
			return tid;
		}
		public void setTid(Integer tid) {
			this.tid = tid;
		}

		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public String getPromo() {
			return promo;
		}
		public void setPromo(String promo) {
			this.promo = promo;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getCreatedAt() {
			return CreatedAt;
		}
		public void setCreatedAt(String createdAt) {
			CreatedAt = createdAt;
		}
		public String getModifiedAt() {
			return ModifiedAt;
		}
		public void setModifiedAt(String modifiedAt) {
			ModifiedAt = modifiedAt;
		}
		




}
