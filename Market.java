class Fruit{
	int calories;
	void makeJuice(){
		System.out.println("juice is made");
		}
	}
	class Apple extends Fruit{
		Apple(int calories){
			this.calories=calories;
			}
			void makeJuice(){
				System.out.println("Apple juice is made");
				}
		}
	class Banana extends Fruit{
		Banana(int calories){
			this.calories=calories;
			}
			void makeJuice(){
			System.out.println("banana juice is made");
				}
		}
		class Market{
			public static void main(String args[]){

			Apple a=new Apple(350);
			a.makeJuice();
			Banana b=new Banana(600);
			b.makeJuice();
				}
			}