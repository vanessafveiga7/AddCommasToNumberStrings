package com.meritamerica.assignment1;

import com.meritamerica.assignment1.Rational;

public Rational multiply(Rational r) { //return * r
	return new Rational(this.num * r.num, this.den * r.den);
}

class HeapStackAssignment {
	public void run() {
		Rational r = new Rational(1,2);
		r = raiseToPower(r, 3);
		println("r ^ 3 = " + r");
	}
	
	private Rational raiseToPower(Rational x, int n) {
		Rational result = new Rational(1);
		for (int i = 0; i < n; i++) { // i = 3
			result = result.multiply(x);
		}
		return result; // <- Diagram at this point
	}
}

/* Heap
r: Rational (1,2)
-result-: Rational(1) // Garbage Collectible
new: Rational(1,2) // Garbage Collectible
new1: Rational(1,4) // Garbage Collectible
new2: Rational (1,8) <-

// Stack
r: Heap r
// -- raiseToPower
x: Heap r
n: int = 3
result: Heap new2
i: int = 3 <-
// -- multiply
// this: Heap new1
// r: Heap r
// temp: Heap new2 */