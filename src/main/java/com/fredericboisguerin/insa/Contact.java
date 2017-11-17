package com.fredericboisguerin.insa;

public class Contact {
        public String name;
        public String email;
        public String phoneNumber;

        public Contact(String nom, String mail, String tel)
        {
                this.name=nom;
                this.email=mail;
                this.phoneNumber=tel;
        }

        public void printContact()
        {
                if ((this.email != null) && (this.phoneNumber != null))
                        System.out.print(this.name + " " + this.email + " " + this.phoneNumber);
                else if ((this.email != null) && (this.phoneNumber == null))
                        System.out.print(this.name + " " + this.email);
                else if ((this.email == null) && (this.phoneNumber != null))
                        System.out.print(this.name + " " + this.phoneNumber);
        }

        public String getEmail() {
                return email;
        }

        public String getName() {
                return name;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }
}
