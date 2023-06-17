package com.vijay.addressbook.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Addreess {

public Addreess(){

};


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "street")
        private String street;

        @Column(name = "city")
        private String city;

        @Column(name = "pin")
        private Integer pin;

        public Addreess(String name, String street, String city, Integer pin) {
                this.name = name;
                this.street = street;
                this.city = city;
                this.pin = pin;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getStreet() {
                return street;
        }

        public void setStreet(String street) {
                this.street = street;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public Integer getPin() {
                return pin;
        }

        public void setPin(Integer pin) {
                this.pin = pin;
        }
}
