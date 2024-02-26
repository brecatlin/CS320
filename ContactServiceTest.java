package Contact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService contactService;
    private Contact testContact;

    @BeforeEach
    void setUp() {
        contactService = new ContactService();
        testContact = new Contact("1", "John", "Doe", "1234567890", "Sample Address");
    }

    @Test
    void addContactTest() {
        contactService.addContact(testContact);
        assertTrue(contactService.hasContact("1"));
        assertEquals(testContact, contactService.getContact("1"));
    }

    @Test
    void addDuplicateContactTest() {
        contactService.addContact(testContact);
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(testContact));
    }

    @Test
    void deleteContactTest() {
        contactService.addContact(testContact);
        contactService.deleteContact("1");
        assertFalse(contactService.hasContact("1"));
    }

    @Test
    void deleteNonexistentContactTest() {
        assertThrows(IllegalArgumentException.class, () -> contactService.deleteContact("nonexistentID"));
    }

    @Test
    void updateContactTest() {
        contactService.addContact(testContact);
        contactService.updateContact("1", "Mike", "Smith", "6063640000", "New Address");
        Contact updatedContact = contactService.getContact("1");

        assertAll("Updated Contact",
            () -> assertEquals("1", updatedContact.getContactID()),
            () -> assertEquals("Mike", updatedContact.getFirstName()),
            () -> assertEquals("Smith", updatedContact.getLastName()),
            () -> assertEquals("6063640000", updatedContact.getPhone()),
            () -> assertEquals("New Address", updatedContact.getAddress())
    );
        
    }
    
    