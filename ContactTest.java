package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
    protected String contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest;
    protected String tooLongContactId, tooLongFirstName, tooLongLastName, tooLongPhoneNumber, tooShortPhoneNumber, tooLongAddress;

    @Test
    void constructorTwoTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest, addressTest, addressTest);
        assertAll("constructor two",
        	    () -> assertEquals(contactId, contact.getContactId()),
        	    () -> assertEquals(firstNameTest, contact.getFirstName()),
        	    () -> assertNotNull(contact.getLastName()),
        	    () -> assertNotNull(contact.getPhone()),
        	    () -> assertNotNull(contact.getAddress())
        	);

        	

    }

    @Test
    void contactIdAndFullNameConstructorTest() {
        Contact contact = new Contact(contactId, firstNameTest, lastNameTest, addressTest, addressTest);
        assertAll("constructor three",
            () -> assertEquals(contactId, contact.getContactID()),
            () -> assertEquals(firstNameTest, contact.getFirstName()),
            () -> assertEquals(lastNameTest, contact.getLastName()),
            () -> assertNotNull(contact.getPhone()),  // Corrected method name
            () -> assertNotNull(contact.getAddress())
        );
    }

    @Test
    void contactIdFullNamePhoneNumberConstructorTest() {
        Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
        assertAll("constructor four",
            () -> assertEquals(contactId, contact.getContactID()),
            () -> assertEquals(firstNameTest, contact.getFirstName()),
            () -> assertEquals(lastNameTest, contact.getLastName()),
            () -> assertEquals(phoneNumberTest, contact.getPhone()),
            () -> assertNotNull(contact.getAddress())
        );
    }


    @Test
    void allTheProperThingsConstructorTest() {
        Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
        assertAll("constructor all",
            () -> assertEquals(contactId, contact.getContactId()),
            () -> assertEquals(firstNameTest, contact.getFirstName()),
            () -> assertEquals(lastNameTest, contact.getLastName()),
            () -> assertEquals(phoneNumberTest, contact.getPhone()),
            () -> assertEquals(addressTest, contact.getAddress())
        );
    }


    @Test
    void updateFirstNameTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest);
        contact.setFirstName(firstNameTest);
        assertAll("first name",
            () -> assertEquals(firstNameTest, contact.getFirstName()),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(tooLongFirstName))
        );
    }

    @Test
    void updateLastNameTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest);
        contact.setLastName(lastNameTest);
        assertAll("last name",
            () -> assertEquals(lastNameTest, contact.getLastName()),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setLastName(tooLongFirstName))
        );
    }


    @Test
    void updatePhoneNumberTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest);
        contact.updatePhoneNumber(phoneNumberTest);
        assertAll("phone number",
            () -> assertEquals(phoneNumberTest, contact.getPhone()),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.updatePhoneNumber(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.updatePhoneNumber(tooLongPhoneNumber)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.updatePhoneNumber(tooShortPhoneNumber)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.updatePhoneNumber(contactId))
        );
    }


     void updateAddressTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest);
        contact.setAddress(addressTest);
        assertAll("phone number",
            () -> assertEquals(addressTest, contact.getAddress()),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setAddress(tooLongAddress))
        );
    }

    @Test
    void updateContactIdTest() {
        Contact contact = new Contact(addressTest, addressTest, addressTest);
        contact.setContactID(contactId);
        assertAll("contact ID",
            () -> assertEquals(contactId, contact.getContactId()),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setContactID(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> contact.setContactID(tooLongContactId))
        );
    }
}

   
