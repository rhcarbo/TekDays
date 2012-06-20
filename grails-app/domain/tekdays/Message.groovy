package tekdays

class Message {
		String subject
		String content
		Message parent
		TekEvent event
		TekUser author
		
    static constraints = {
    	subject(blank:false)
			content(blank:false, maxSize:5000)
			parent(nullable:true)
			author(nullable:true)
		}
		static belongsTo = TekEvent
}
