package grovy

class Exercise4 {
	
	static void main(def args) {
		
		def str = "This is a Groovy Language"
		
		// reverse the string
		 println str.reverse()
		 
		 //Print a subString 
		 println str.substring(10)
		 
		 //Split the string into separate words
		 println str.split(" ")
		 
		 //Remove words from the given string
		  println str.minus(" Groovy")
		 
		 //Convert the given string toLowerCase and toUpperCase
		 println str.toLowerCase()
		 println str.toUpperCase()
		 
		 // matches the words
		 def matches = str.matches("(.*)Groovy(.*)")
		 if(matches) println "String matches"
		 else println "Does not match"
		 
		 // replace the words
		 println str.replaceAll("Groovy", "very groovy")
	}
	
}
