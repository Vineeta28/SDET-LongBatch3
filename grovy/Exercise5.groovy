package grovy

class Exercise5 {
	
	static void main(def args) {
		
		def fullList = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def strList = fullList.minus([11, 2, 19, 5])
		
		def intList = fullList.minus(["Mango", "Apple", "Watermelon"])
		
		println "String sorted list :${strList.sort()} " + strList.sort()
		
		println "String sorted list :" + intList.sort()		
		
	}
	
}
