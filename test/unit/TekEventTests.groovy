/***
 * Excerpted from "Grails: A Quickstart Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails for more book information.
***/
import grails.test.*

class TekEventTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

  void testToString() {
    def tekEvent = new TekEvent(name: 'Groovy One',
                                city: 'San Francisco, CA',
                                organizer: [fullName:'John Doe'] as TekUser,
                                venue: 'Moscone Center',
                                startDate: new Date('6/2/2009'),
                                endDate: new Date('6/5/2009'),
                                description: 'This conference will cover all...')
    assertEquals 'Groovy One, San Francisco, CA', tekEvent.toString()
  }
}
