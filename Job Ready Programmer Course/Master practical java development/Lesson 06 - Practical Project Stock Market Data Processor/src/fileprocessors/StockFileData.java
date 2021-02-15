package fileprocessors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<>();
	
	public void printData(){
		
		for (HashMap<String, Double> map : data ) {
			System.out.println(map);
		}
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
}
