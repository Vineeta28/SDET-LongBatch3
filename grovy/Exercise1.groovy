package grovy

class Exercise1 {
	
	static void main(def args) {
	def x
	int y
	def arr = [2, 3.0, "Anu", true, x, y]
	arr.each { println "Value is: " + it + ". Data type is: " + it.getClass() }
	}
}
