import tekdays.*
class BootStrap {

    def init = { servletContext ->
			new TekUser(fullName:'John Doe',
					userName: 'jdoe',
					password: 'password',
					email: 		'john@groovymail.com',
					website: 	'blog.johnswebshop.com',
					bio: '''John is an amazing programming but has no idea of how to do this''').save()
			
			new TekUser(fullName:'Mary Jane',
					userName: 'mjane',
					password: 'password',
					email: 		'mary@groovymail.com',
					website: 	'blog.maryjaneswebshop.com',
					bio: '''Mary has a little lamb whose coat was white as snow''').save()
			
			def event1 = new TekEvent(name: 'Gateway Code Camp',
									city: 'Saint Louis, MO',
									organizer: TekUser.findByFullName('John Doe'),
									venue: 'TBD',
									startDate: new Date('11/01/2012'),
									endDate: new Date('12/01/2012'),
									description: '''This is an awesome conference, come and enjoy it, 
									you won't regret it...''')
			if (!event1.save()) {
				event1.errors.allErrors.each{ error ->
					println "An Error has occured with event1: ${error}"
				}
			}
			
			def event2 = new TekEvent(name: 'Perl before swine',
									city: 'Austin, MN',
									organizer: TekUser.findByFullName('Mary Jane'),
									venue: 'SPAM museum',
									startDate: new Date('11/01/2012'),
									endDate: new Date('12/01/2012'),
									description: '''This is another great event and you will like it...''')
			if (!event2.save()) {
				event2.errors.allErrors.each{ error ->
					println "An Error has occured with event2: ${error}"
				}
			}
			def sponsor1 = new Sponsor(name:'Contegix',
																website: 'contegix.com',
																description: 'Beyond managed hosting for your website').save()
			def sponsor2 = new Sponsor(name:'Object Computing incorporated',
																website: 'OCI.com',
																description: 'An OO Software development company').save()

			def sponsorship1 = new Sponsorship(event: event1,
				contributionType: 'Other',
				sponsor: sponsor1,
				description: 'Cool T-Shirts')
			def sponsorship2 = new Sponsorship(event: event2,
				contributionType: 'Venue',
				sponsor: sponsor2,
				description: 'Amazing laptops')
			sponsor1.addToSponsorships(sponsorship1)
			sponsor1.save()
			sponsor2.addToSponsorships(sponsorship2)
			sponsor2.save()
				
			def tekEvent = TekEvent.findByName('Gateway Code Camp')
			tekEvent.addToVolunteers(new TekUser(fullName: 'Sarah Martin',
				userName: 'sarah',
				password: 'password',
				email: 'someEmail@yahoo.com',
				website: 'google.com',
				bio: 'Nothing to say really',			
				))
			tekEvent.addToVolunteers(new TekUser(fullName: 'Bill Martin',
				userName: 'bill',
				password: 'password',
				email: 'someEmail@yahoo.com',
				website: 'google.com',
				bio: 'Nothing to say really',			
				))
			tekEvent.addToRespondents('ricky@gmail.com')
			tekEvent.addToRespondents('goony@gmail.com')
			tekEvent.addToRespondents('mackay@gmail.com')
			tekEvent.addToSponsorships(sponsorship1)
			tekEvent.addToSponsorships(sponsorship2)
			tekEvent.save()
    }
    def destroy = {
    }
}
