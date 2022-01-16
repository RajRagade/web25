package Assignment;

		public class SuperDepartment {
	
			public static void departmentName() {
		
					System.out.println("Super Department ");
					return;
	}
	
			public static void getTodaysWork() {
		
					System.out.println("No Work as of now ");
					return;
	}
			

			public static void getWorkDeadline() {
				
				System.out.println("Nil ");
				return;
			
		}
	
			public static void isTodayAHoliday() {
				
				System.out.println("Today is not a holiday ");
				return;
			
		}
	public static void main(String args[])
	{
		
		AdminDepartment.departmentName1();
		AdminDepartment.getTodaysWork1();
		AdminDepartment.getWorkDeadline1();
		isTodayAHoliday();
		HrDepartment.departmentName2();
		HrDepartment.getTodaysWork2();
		HrDepartment.getWorkDeadline2();
		HrDepartment.isTodayAHoliday2();
		isTodayAHoliday();
		TechDepartment.departmentName3();
		TechDepartment.getTodaysWork3();
		TechDepartment.getWorkDeadline3();
		TechDepartment.isTodayAHoliday3();
		isTodayAHoliday();
	}
	
}
