package porzdokInicialization;

/**
 * Порядок инициализации таков: 
 * [1]. Статические поля базового класса; 
 * [2]. Статический блок инициализации базового класса; 
 * [3]. Статические поля производного класса; 
 * [4]. Статический блок инициализации производного класса;
 * [5]. Поля (Глобальные переменные) базового класса; 
 * [6]. Нестатический блок инициализации базового класса; 
 * [7]. Конструктор базового класса [если у
 * родителя нет конструктора без аргументов, то код приведёт к ошибке
 * компиляции]; 
 * [8]. Поля (Глобальные переменные) производного класса; 
 * [9]. Нестатический блок инициализации производного класса; 
 * [10]. Конструктор производного класса;
 */

class Pervii {
	
	static int PerviiStatFild = 1;
	int PerviiFild = 11;
	
	static {
		System.out.println("1 - Статические поля базового класса Pervii " + PerviiStatFild);
		System.out.println("2 - Статический блок инициализации базового класса Pervii");
	}
	{
		System.out.println("5 - Поля (Глобальные переменные) базового класса Pervii " + PerviiFild);
		System.out.println("6 - Нестатический блок инициализации базового классa Pervii");
	}
	public Pervii(int perviiFild) {
		super();
		PerviiFild = perviiFild;
	}
	public Pervii() {
		super();
		System.out.println("7 - Конструктор базового класса Pervii");
	}
	
}

class Vtoroi extends Pervii {
	
	static int VtoroiStatFild = 2;
	int VtoroiFild = 22;
	
	static {
		System.out.println("1 - Статические поля базового класса Vtoroi" + VtoroiStatFild);
		System.out.println("2 - Статический блок инициализации базового класса Vtoroi");
	}
	{
		System.out.println("5 - Поля (Глобальные переменные) базового класса Vtoroi " + VtoroiFild);
		System.out.println("6 - Нестатический блок инициализации базового классa Vtoroi");
	}
	public Vtoroi(int perviiFild, int vtoroiFild) {
		super(perviiFild);
		VtoroiFild = vtoroiFild;
	}
	public Vtoroi(int perviiFild) {
		super(perviiFild);
	}
	public Vtoroi() {
		super();
		System.out.println("7 - Конструктор базового класса Vtoroi");
	}
	
}

class Tretii extends Vtoroi{
	
	static String name = "Artem";
	static String lastName = "Shumko";
	int age = 34;
	
	static {
		System.out.println("3 - Статические поля производного класса Tretii");
		System.out.println(name + " " + lastName);
		System.out.println("4 - Статический блок инициализации производного класса Tretii");
	}
	{
		System.out.println("8 - Поля (Глобальные переменные) производного класса Tretii " + age);
		System.out.println("9 - Нестатический блок инициализации производного класса Tretii");
	}


	public Tretii() {
		super();
		System.out.println("10 - Конструктор производного класса Tretii");
	}
	
			
}

public class InitTester2 {

	public static void main(String[] args) {
		
		Tretii tretii = new Tretii();
		
		

	}

}
