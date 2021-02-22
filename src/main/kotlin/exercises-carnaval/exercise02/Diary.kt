package `exercises-carnaval`.exercise02

class Diary {
    val  contacts: MutableList<Contact> = mutableListOf()

    fun saveContact(contact: Contact) {
        if(contacts.count() < 10) {
                if (contacts.contains(contact)) {
                    println("Contato já existe na agenda!")
                } else {
                    contacts.add(contact)
                }
        }else{
                println("Agenda Lotada!")
            }
        }


    fun removeContact(contact: Contact) {
        contacts.remove(contact)
    }

    fun getContact(name: String) {
        for (contact in contacts) {
            if (name == contact.name) {
                println("Name : ${contact.name}")
                println("Phone Number : ${contact.phoneNumber} \n")
            }
        }
    }

    fun getAllContacts() {
        for (contact in contacts) {
            println("Name : ${contact.name}")
            println("Phone Number : ${contact.phoneNumber} \n")
        }
    }

}