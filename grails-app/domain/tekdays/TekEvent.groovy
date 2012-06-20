package tekdays

class TekEvent {
		String city
		String name
		TekUser organizer
		String venue
		Date startDate
		Date endDate
		static hasMany = [volunteers: TekUser, respondents: String, sponsorships: Sponsorship, 
			tasks: Task, messages: Message]
		String description
		
		String toString (){
			"$name, $city"
		}
		
    static constraints = {
			name()
			city()
			description(maxSize:50000)
			organizer()
			venue()
			startDate()
			endDate()
			sponsorships(nullable:true)
			tasks(nullable:true)
			messages(nullable:true)
    }
}
