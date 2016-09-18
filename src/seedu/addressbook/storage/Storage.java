package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public interface Storage {
    abstract public StorageFile initializeStorage() throws InvalidStorageFilePathException;
    abstract public AddressBook load() throws StorageOperationException;
    abstract public void save(AddressBook addressBook) throws StorageOperationException;
    abstract public String getPath();
}