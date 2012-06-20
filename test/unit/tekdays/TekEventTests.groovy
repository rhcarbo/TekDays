package tekdays

import grails.test.*

class TekEventTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testToString() {
			def tekEvent = new TekEvent(name: 'Groovy one',
																	city: 'San Francisco',
																	organizer: [fullName:'John Doe'] as TekUser,
																	venue: 'Moscone Center',
																	startDate: new Date('30/05/2012'),
																	endDate: new Date('31/05/2012'),
																	description: 'This conference is the best in the country')
			assertEquals 'Groovy one, San Francisco', tekEvent.toString()
    }
}