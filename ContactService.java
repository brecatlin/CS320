/* 
 * @author Breanna Smith
 * SNHU 320 Module 3- Milestone
 */
package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

    // Constructor
    public ContactService() {
        this.contacts = new HashMap<>();
    }

    // Method to add a contact with a unique ID
    public void addContact(Contact contact) {
        String contactID = (String) contact.getContactID();
        if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be null.");
        }

        if (!contacts.containsKey(contactID)) {
            contacts.put(contactID, contact);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactID + " already exists.");
        }
    }

    // Method to delete a contact per contact ID
    public void deleteContact(String contactID) {
        if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be null.");
        }

        if (contacts.containsKey(contactID)) {
            contacts.remove(contactID);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactID + " not found.");
        }
    }

    // Method to update contact fields per contact ID
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be null.");
        }

        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            // Update fields if not null
            if (firstName != null) {
                contact.setFirstName(firstName);
            }
            if (lastName != null) {
                contact.setLastName(lastName);
            }
            if (phone != null) {
                contact.setPhone(phone);
            }
            if (address != null) {
                contact.setAddress(address);
            }
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactID + " not found.");
        }
    }

    // Add any additional methods as needed

    // Method to get a contact by ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

    // Method to check if a contact exists by ID
    public boolean hasContact(String contactID) {
        return contacts.containsKey(contactID);
    }
}
