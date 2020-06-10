package jokbopr0529;
class car{
	int gasolineGauge;
}
class HybridCar extends Car{
	int electricGauge;
}
class HybridWaterCar extends HybridCar{
	int waterGage() {
		System.out.println("잔여 가솔린:"+gasolineGauge);
		System.out.println("잔여 전기량:"+electricGauge);
		System.out.println("잔여 워터량"+waterGauge);
	}
}
public class Cargas {

}
