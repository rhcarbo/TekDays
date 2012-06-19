/***
 * Excerpted from "Grails: A Quickstart Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails for more book information.
***/
class Sponsorship {
    TekEvent event
    Sponsor sponsor
    String contributionType
    String description
    String notes
    
    static constraints = {
        event(nullable:false)
        sponsor(nullable:false)
        contributionType(inList:["Other", "Venue", "A/V", "Promotion", "Cash"])
        description(nullable:true, blank:true)
        notes(nullable:true, blank:true, maxSize:5000)
    }
}
