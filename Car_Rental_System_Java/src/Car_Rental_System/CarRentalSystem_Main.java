package Car_Rental_System;

public class CarRentalSystem_Main {
	public static void main(String[] args) {
		RentalSystem rentalSystem = new RentalSystem();

		Car car1 = new Car("MH001", "Toyota", "Fortuner", 2000.0);
		Car car2 = new Car("MH002", "TATA", "Nano", 500.0);
		Car car3 = new Car("MH003", "Mahindra", "Thar", 1500.0);
		
		rentalSystem.addCar(car1);
		rentalSystem.addCar(car2);
		rentalSystem.addCar(car3);

		rentalSystem.menu();
	}

}
