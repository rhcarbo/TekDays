/***
 * Excerpted from "Grails: A Quickstart Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails for more book information.
***/
class Message {
    String subject
    String content
    Message parent
    TekEvent event
    TekUser author
    
    static constraints = {
        subject(blank:false)
        content(blank:false, maxSize:2000)
        parent(nullable:true)
        author(nullable:false)
    }
    
    static belongsTo = TekEvent
}
