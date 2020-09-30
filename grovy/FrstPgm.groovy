package grovy

class FrstPgm {
	
	static void main(def args) {
		println "Hello, World !"
		def name = "John"
		def s1 = "Hello $name" // $name will be replaced
		def s2 = 'Hello $name' // $name will not be replaced
		println s1
		println s2
		
		//print type of variable
		println s1.getClass()
		println s2.getClass()
		
		// demonstrates object references and method calls
		def date = new Date()
		println "We met at $date"
		
		def str1 = """#1 Hello
This is a multi line
string example
"""
		 
		def str2 = '''#2
This is
Another multi line
string sammple
'''
		 
		def str3 = '#3 This is\
		a sample with\
		backslash'
		 
		def str4 = '\n#4 Another example\n\
		with backslash\n\
		and next line'

		println str1
		println str2
		println str3
		println str4
		
	}
}
