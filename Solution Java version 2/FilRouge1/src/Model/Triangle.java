package Model;

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String Compare() {
		int a = this.a;
		int b = this.b;
		int c = this.c;
		if ((a == b &  b!= c & c!=a)| (a != b &  b!= c & c==a) | (a != b &  b== c & c!=a)){
			return "Triangle isocèle";
		}

		else if (a == b &&  b == c) {
			return "Triangle équilatéral";
		}

		else {

			return "Triangle scalène";
		}
	}

}
