package jokbopr0529;
class car{
	int gasolineGauge;
}
class HybridCar extends Car{
	int electricGauge;
}
class HybridWaterCar extends HybridCar{
	int waterGage() {
		System.out.println("�ܿ� ���ָ�:"+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ:"+electricGauge);
		System.out.println("�ܿ� ���ͷ�"+waterGauge);
	}
}
public class Cargas {

}
