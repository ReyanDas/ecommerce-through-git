package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Users")
public class Userbean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name ="user_name")
	private String userName;
	
	@Column(name ="email")
	private String userEmail;
	
	@Column(length = 10,name ="phonenumber")
	private int userPhone;
	
	@Column(name ="user_picture")
	private String userPicture;
	
	@Column(length = 1500,name = "user_address")
	private String userAddress;
	
	
	

	public Userbean() {
		super();
	}

	public Userbean(int userId, String userName, String userEmail, int userPhone, String userPicture,
			String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userPicture = userPicture;
		this.userAddress = userAddress;
	}

	public Userbean(String userName, String userEmail, int i, String userPicture, String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = i;
		this.userPicture = userPicture;
		this.userAddress = userAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "Userbean [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", userPicture=" + userPicture + ", userAddress=" + userAddress + "]";
	}
	
	
	

}
