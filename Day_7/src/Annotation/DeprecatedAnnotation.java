package Annotation;

import java.util.Objects;

class Sample{
	int marks;
	@Deprecated
	public void hello() {
		System.out.println("Hello");
	}
	@Override
	public String toString() {
		return "Sample [marks=" + marks + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return marks == other.marks;
	}	
}
public class DeprecatedAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.hello();

	}

}
