package grovy

class Exercise6 {
	
	static void main(def args) {
		
		def map = [:]
		map.put(1, "cats")
		map.put(2, "dogs")
		map.put(3, "wolves")
		
		println map
				
		for(def item:map) {
			println item
		}
		
	def newMap = map.plus([4:"horses", 5:"foxes"])
	println newMap
	
	println newMap.values().sort()
	
	println newMap.values().sort() {it.length()}

	}
}
