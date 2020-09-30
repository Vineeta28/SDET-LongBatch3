package grovy

class Exercise2 {
	
	static void main(def args) {
		
		def marks = [25,45,65,85,90]
		def sum=0,avg,grade
		
		marks.each { sum+= it }
		avg = sum/marks.size() as Integer
		
		
		// Get grade
		switch(avg) {
			case 90..100:
				grade = "A"
				break
			case 80..89:
				grade = "B"
				break
			case 70..79:
				grade = "C"
				break
			case 50..69:
				grade = "D"
				break
			case 0..49:
				grade = "F"
				break
			default:
				println "Invalid value"
		}
		
		println "Max marks obtained: "+marks.max()
		println "Min marks obtained: "+marks.min()
		println "Avg marks obatined: "+avg
		println "Sum of the marks obtained: "+sum
		println "Grade of the student: "+grade
		
	}
}
