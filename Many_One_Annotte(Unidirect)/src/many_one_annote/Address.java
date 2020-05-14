package many_one_annote;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	private int aid;
	private String city;
	private String zipcode;
	
	@Id
	@Column(name="AID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	@Column(name="CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="ZIPCODE")
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
