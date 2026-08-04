class Printer{
void print(Integer a) {
System.out.print("A" + a);
}
void print(Object a) {
System.out.print("B" + a);
}
void print(Number a) {
System.out.print("C" + a);
}
}
class GenericTest<T>{
T value;
public GenericTest(T t) {//생성자
value=t;
}
public void print() {
new Printer().print(value);
}
}
public class Homework {
public static void main(String[] args) {
new GenericTest<>(0).print();
new GenericTest<Integer>(0).print(); //B0
new GenericTest<Number>(0).print(); //B0
new GenericTest<>(new Integer(0)).print(); //B0
new GenericTest<Integer>(new Integer(0)).print(); //B0
}
}