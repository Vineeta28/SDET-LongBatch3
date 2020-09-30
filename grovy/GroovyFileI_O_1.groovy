package grovy

class GroovyFileI_O_1 {
	
	static void ReadFromFile() {
		// write the content of the file to the console
		def file = new File("./resources/text.txt")
		
		//Print each line in the file
		file.eachLine{ line -> println line }
	
		// adds a line number in front of each line to the console
		def lineNumber = 0
		file.eachLine {
			line ->
			lineNumber++
			println "$lineNumber: $line"
		}
	}
	
	static void main(def args) {
		ReadFromFile();
	}
}
