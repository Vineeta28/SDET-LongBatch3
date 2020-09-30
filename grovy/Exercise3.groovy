package grovy

class Exercise3 {
	
	static void main(def args) {
		
		def n1 = 0, n2 = 1, count = 10
		println n1
		count.times { 
			(n1,n2) = [n2, n1+n2]
			println  n1
		}
		
		
		
	}
}
