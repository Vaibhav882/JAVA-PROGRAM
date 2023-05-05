package firstclass;

class Abd {
	
		void test()
		{
			System.out.println("without Parameters");
		}
		void test(int a)
		{
			System.out.println("with Parameters");
		}
		void test(double d)
		{
			System.out.println("without double Parameters");
		}
		void test(Abc o)
		{
			System.out.println("without object Parameters");
		}
	}
	class Functionverloding
	{
		public static void main (String [] args)
		{
			Abd o1=new Abd();
			o1.test();
			o1.test(10.30);
			o1.test(01);
			
		}
	}
	


