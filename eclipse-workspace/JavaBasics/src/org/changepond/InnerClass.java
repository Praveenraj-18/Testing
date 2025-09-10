//package org.changepond;
//
//public class InnerClassDemo {
//	//nested static class
//	private static int counter = 0;
//	int seq = 1;
//	static class StaticNestedClass{
//		void display() {
//			counter += 1;
//			System.out.println("Counter : " + counter);
//		}
//		public static void main(String[] args) {
//			InnerClassDemo.StaticNestedClass sn = new InnerClassDemo.StaticNestedClass();
//			sn.display();
//			sn.display();
//		}
//	}
//}
 
 
//package org.changepond;
//
//public class InnerClassDemo {
//	//nested static class
////	private static int counter = 0;
//	int seq = 1;
//	boolean evenflag = true;
//	class IncrementCounter{
//		void display() {
//			if(!evenflag) {
//				seq += 2;
//		}
//			else {
//				seq += 1;
//			}
//		System.out.println("Sequence :" + seq);
//		System.out.println("even flag :" + evenflag);
//}
//		public static void main(String[] args) {
//			InnerClassDemo inn = new InnerClassDemo();
//			InnerClassDemo.IncrementCounter ic = inn.new IncrementCounter();
//			ic.display();
////			ic.display();
//		}
//	}
//}
 
//package org.changepond;
// 
//public class InnerClassDemo {
//    int seq = 1;
//    boolean evenflag = true;
// 
//    class IncrementCounter {
//        void display() {
//            if (!evenflag) {
//                seq += 2;
//            } else {
//                seq += 1;
//            }
//            System.out.println("Sequence :" + seq);
//            System.out.println("even flag :" + evenflag);
//        }
//    }
// 
//    public static void main(String[] args) {
//        InnerClassDemo inn = new InnerClassDemo();
//        InnerClassDemo.IncrementCounter ic = inn.new IncrementCounter();
//        ic.display();
//    }
//}
//package org.changepond;
//
//public class OuterClass {
//	void displayStatus() {
//		int year = 2019;
//		class DisplayAge{
//			String status = "Adult";
//			void displayAge() {
//				int age = 2025 - year;
//				if(age>17) {
//					System.out.println("Enter Person Age is " + age + "and status is " + status);
//				}
//				else {
//					status = "Non-Adult";
//					System.out.println("Entered Person Age is " + age + "and ststus is" + status);
//				}
//			}
//			DisplayAge da = new DisplayAge();
//			da.displayAge();
//		}
//	}
//}
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

//outer class

//package org.changepond;
//
//public class OuterClass {
//  void displayStatus() {
//      int year = 2019;
//      class DisplayAge {
//          String status = "Adult";
//          void displayAge() {
//              int age = 2025 - year;
//              if (age > 17) {
//                  System.out.println("Entered Person Age is " + age + " and status is " + status);
//              } else {
//                  status = "Non-Adult";
//                  System.out.println("Entered Person Age is " + age + " and status is " + status);
//              }
//          }
//      }
//      DisplayAge da = new DisplayAge();
//      da.displayAge();
//  }
//
//  public static void main(String[] args) {
//      OuterClass outer = new OuterClass();
//      outer.displayStatus();
//  }
//}
//abstract class
//package org.changepond;
//abstract class Person{
//	abstract void display();
//}
//public class OuterClassDemo {
// 
//public static void main(String[] args) {
//	Person person = new Person() {
//		void display() {
//			System.out.println("Anonymous inner class");
//		}
//	};
//	person.display();
//}
// 
//}
 



