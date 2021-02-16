package aggregators;
import java.io.IOException;
import java.util.List;
import fileprocessors.StockFileReader;

public class AggregatorProcessor<aggregator> {
	
	Aggregator aggregator;
	String filePath;
	
	public AggregatorProcessor(Aggregator aggType, String filePath) {
		this.aggregator =  aggType;
		this.filePath = filePath;	
	}
	
	public double runAggregator(int col) throws IOException {
		
		StockFileReader fr = new StockFileReader(filePath);
		List<String> data = fr.readFileData();
		
		for (String dataLine : data) {
			String[] stringValues = dataLine.split(",");
			double number = Double.parseDouble(stringValues[(col - 1)]);
			aggregator.add(number);
		}
		return aggregator.calculate();
	}
	
	
}
