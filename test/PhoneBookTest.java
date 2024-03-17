import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void addContact() {
        PhoneBook phoneBook = new PhoneBook();
        String contactDetails = "David Oladipo\n123-456-7890\noladipo.david@outlook.com\nNVIDIA Inc.\n154 Trident Ln.\nSilicon Valley, CA";
        phoneBook.addContact(contactDetails);
        assertEquals(1, phoneBook.contacts.size());
        assertEquals(contactDetails, phoneBook.getFirst());
    }

    @Test
    void viewContacts() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("David Oladipo\n123-456-7890\noladipo.david@outlook.com\nNVIDIA Inc.\n154 Trident Ln.\nSilicon Valley, CA");
        phoneBook.viewContacts();
        assertEquals(1, phoneBook.contacts.size());
    }

    @Test
    void editContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("David Oladipo\n123-456-7890\noladipo.david@outlook.com\nNVIDIA Inc.\n154 Trident Ln.\nSilicon Valley, CA");
        String oldContact = "David Oladipo";
        String newContact = "David Magnifico";
        phoneBook.editContact(oldContact, newContact);
        assertEquals("David Magnifico\n123-456-7890\noladipo.david@outlook.com\nNVIDIA Inc.\n154 Trident Ln.\nSilicon Valley, CA", phoneBook.getFirst());
    }

    @Test
    void deleteContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("David Oladipo\n123-456-7890\noladipo.david@outlook.com\nNVIDIA Inc.\n154 Trident Ln.\nSilicon Valley, CA");
        String contactToDelete = "David Oladipo";
        phoneBook.deleteContact(contactToDelete);
        assertEquals("Phone book is empty", phoneBook.getFirst());
    }
}
