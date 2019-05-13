package veiculos;

public class Toyota_PRIUS {
	
	
	public void imprimir() {
		
		
	}
	
	public static void main(String[] args) {
		
		Carro p1 = new Carro();
		 p1.nome = "Toyota PRIUS";
		 p1.setPlaca("FXR-9915");
		 p1.lancamento = 2018;
		 p1.porte = "Médio";
		 p1.portas = "4";
		 p1.preco = "R$110.850";
		 p1.combustivel = "Hibrido";
		 p1.velocidade = "165KM";
		 p1.consumo = "18,9 KM/L";
		
		Carro p2 = new Carro();
		 p2.nome = "Ford Fusion Hybrid 2.0";
		 p2.setPlaca("BAS-2345");
		 p2.lancamento = 2019;
		 p2.porte = "Grande";
		 p2.portas = "4";
		 p2.preco = "R$182.990";
		 p2.combustivel = "Hibrido";
		 p2.velocidade = "180KM";
		 p2.consumo = "16,8 KM/L";
		 
		Carro p3 = new Carro();
		 p3.nome = "Lexus CT200H";
		 p3.setPlaca("LPO-6666");
		 p3.lancamento = 2019;
		 p3.porte = "Medio";
		 p3.portas = "4";
		 p3.preco = "R$153,300";
		 p3.combustivel = "Hibrido";
		 p3.velocidade = "180KM";
		 p3.consumo = "15,7 KM/L";
		 
		 Tesla_Model_3 p4 = new Tesla_Model_3();
		 p4.nome = "Tesla Model 3";
		 p4.setPlaca("XDA-2245");
		 p4.lancamento = 2018;
		 p4.procedencia = "importado";
		 p4.porte = "Médio";
		 p4.portas = "4";
		 p4.preco = "R$620.000";
		 p4.combustivel = "Eletricidade";
		 p4.velocidade = "233KM";
		 p4.consumoE = "18 kWh/100KM";
		 p4.potencia = "350 CV";
		 p4.autonomia = "499 KM";
		 
		
		 
		 System.out.println("p1.lançamento " + p1.lancamento + " p1.porte " + p1.porte + " p1.placa " + p1.getPlaca());
				


	}
	
			
}
