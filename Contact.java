package Contact;
/* 
 * @author Breanna Smith
 * SNHU 320 Module 3- Milestone
 */

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        // Validate and set values
        setContactID(contactID);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Getter and setter methods

    public Contact(String contactId2, String firstNameTest, String lastNameTest) {
		// TODO Auto-generated constructor stub
	}

	public String getContactID1() {
        return contactID;
    }

    // Ensure that contact ID is not null and does not exceed 10 characters
    public void setContactID(String contactID) {
        if (contactID != null && contactID.length() <= 10) {
            this.contactID = contactID;
        } else {
            throw new IllegalArgumentException("Contact ID must not be null and must be 10 characters or less.");
        }
    }

    // Similarly, implement validations for other fields...

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name must not be null and must be 10 characters or less.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name must not be null and must be 10 characters or less.");
        }
    }

    public String getPhone() {
        return phone;
    }

    // Ensure that phone is not null and has exactly 10 digits
    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{10}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must not be null and must have exactly 10 digits.");
        }
    }

    public String getAddress() {
        return address;
    }

    // Ensure that address is not null and does not exceed 30 characters
    public void setAddress(String address) {
        if (address != null && address.length() <= 30) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Address must not be null and must be 30 characters or less.");
        }
    }

	public Object getContactId1() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePhoneNumber(String phoneNumberTest) {
		// TODO Auto-generated method stub
		
	}

	public Object getContactId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getContactID() {
		// TODO Auto-generated method stub
		return null;
	}

    // Add any additional methods or validations as needed
}
