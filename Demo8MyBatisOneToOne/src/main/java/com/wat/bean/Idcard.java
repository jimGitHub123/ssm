package com.wat.bean;

public class Idcard {
        private    Integer  id; 
        private    String   idcardcode;    //���֤��
        private    String   pic;           //���֤ͼƬ
        private    People   people;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getIdcardcode() {
			return idcardcode;
		}
		public void setIdcardcode(String idcardcode) {
			this.idcardcode = idcardcode;
		}
		public String getPic() {
			return pic;
		}
		public void setPic(String pic) {
			this.pic = pic;
		}
		public People getPeople() {
			return people;
		}
		public void setPeople(People people) {
			this.people = people;
		}
}
