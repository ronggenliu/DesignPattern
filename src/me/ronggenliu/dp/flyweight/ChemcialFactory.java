package me.ronggenliu.dp.flyweight;
import java.util.HashMap;
import java.util.Map;


public class ChemcialFactory {

	private static Map<String, Chemical> chemicals = new HashMap<String, Chemical>();
	
	public void createChemical(String name, String symbol, double atomicWeight) {
		if(!chemicals.containsKey(name)) {
			chemicals.put(name, this.new ChemicalImpl(name, symbol, atomicWeight));
		};
	}
	
	public Chemical getChemical(String name) {
		return chemicals.get(name);
	}
	
	class ChemicalImpl implements Chemical {

		private String name;
		private String symbol;
		private double atomicWeight;
		
		public ChemicalImpl(String name, String symbol, double atomicWeight) {
			super();
			this.name = name;
			this.symbol = symbol;
			this.atomicWeight = atomicWeight;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public double getAtomicWeight() {
			return atomicWeight;
		}
		public void setAtomicWeight(double atomicWeight) {
			this.atomicWeight = atomicWeight;
		}
		
	}
}
