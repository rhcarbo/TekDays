/***
 * Excerpted from "Grails: A Quickstart Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails for more book information.
***/
class TekUser {
    String fullName
    String userName
    String password
    String email
    String website
    String bio
    
    String toString(){ fullName } 
    
    static constraints = {
        fullName()
        userName()
        email()
        website()
        bio(maxSize:5000)
    }  
}
