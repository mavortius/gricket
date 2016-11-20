package com.gricket.domain

import grails.persistence.Entity

@Entity
class Customer {

    String company
    String lastName
    String firstName
    String city
    String stateProvince
    String zipPostalCode

    static mapping = {
        version false
        table 'customers'
    }
}
