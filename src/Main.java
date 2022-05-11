public class Main {

    public static void main(String[] args) {

        ContactsBook book = new ContactsBook();

        book.add(new Contact("Максим", "+7-8005553535"));
        book.add(new Contact("Алексей", "+21-444444444"));
        book.add(new Contact("Андрей", "+55-444613333"));
        book.add(new Contact("Николай", "+1-8153444222"));
        book.add(new Contact("Сергей", "+7-8153444111"));
        book.add(new Contact("Алексей", "+7-8444666666"));


        Contact foundContact = book.getByPhone("+7-8005553535");
        System.out.println(foundContact);
        book.removeByPhone("+21-444444444");
        System.out.println(book.returnContactsBook());

        System.out.println(book.searchBy(contact -> contact.getName().equals("Максим")));
        System.out.println(book.searchBy("Ан*ей"));

        System.out.println(book.getCountries());
    }

}
