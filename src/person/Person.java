package person;

public class Person {
        private String firstName;
        private String lastName;
        private LinkedList<String> contacts;
        private String email;

        public Person(String fn, String ln, LinkedList<String> cn, String e) {
            firstName = fn;
            lastName = ln;
            contacts = cn;
            email = e;
        }


    }
