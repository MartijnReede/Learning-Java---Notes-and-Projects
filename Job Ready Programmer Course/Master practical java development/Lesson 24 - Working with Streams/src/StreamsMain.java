import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {

	public static void main(String[] args) throws IOException {
		
		//Streams make heavy use of lambda expressions. 
		
		//What is a stream? 
		//It's a pipeline that consist of a course, intermediate operations and the final terminal operation. 
		//		SOURCE: Collections, files, data etc....
		//		INTERM OP: Filter, sort, map, etc.... methods.
		//		TERMINL OP: Collect, forEach, count, sum, max, etc.... it ends the stream. 
		
		//You can use zero or more intermediate operations. They are not a must. Order matters.
		//If you have a large data set, its better to filter first before doing something else. 
		//With really big data sets we can use parallel stream, which divides all the work over multiple threads.
		
		//******* ADDING FILES CORRECTLY ********
		// 1. I've added a folder into this java-project name "files".
		// 2. I've copied the files into the files folder.
		// 3. We have to make sure the files are included in the build path.
		// 4. Go to configure build path --> source --> add folder --> select folder --> apply.
		// 5. Make sure that you can see the folder in the "Order and export" tab.
		
		//******** INT STREAM *************
		//Prints the numbers 1 to 9.
		IntStream.range(1, 10)
		.forEach(x -> System.out.print(x + " "));
		System.out.println("\n--\n");
		
		//*********** SKIP METHOD *************
		//Skips the first 5 numbers.
		IntStream.range(1, 10)
		.skip(5)
		.forEach(x -> System.out.print(x + " "));
		System.out.println("\n--\n");
		
		//*********** SUM OPERATION *************
		//Sums all the integers
		int sum = IntStream.range(1, 10).sum();
		System.out.println("Sum is: " + sum);
		System.out.println("\n--\n");
		
		//*********** STREAM OF: SORTED AND FIND FIRST *************
		Stream.of("Hello", "Bottle", "Africa")
		.sorted()
		.findFirst()
		.ifPresent(x -> System.out.println(x));
		System.out.println("\n--\n");
		//ifPresent is to prevent null pointer exceptions. It's always smart to use ifPresent.
		
		//*********** STREAM OF ARRAY: SORT FILTER AND PRINT*************
		String[] items = {"Car","Baseball","Beer","Crowbar","Joystick","Wineglass","Fishsoup","Hotdog","PorkGyros","Frikadel"};
		Stream.of(items)
		.filter((x) -> x.startsWith("B"))
		.sorted()
		.forEach(x -> System.out.println(x));
		System.out.println("\n--\n");
		
		//***********AVARAGE OF SQUARES OF AN INT ARRAY*************
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map((x) -> x * x)
		.average()
		.ifPresent(n -> System.out.println(n));
		System.out.println("\n--\n");
		
		//***********STREAM FROM A LIST, FILTER AND PRINT *************
		List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door", "Toy");
		listOfItems.stream()
		.map(x -> x.toLowerCase())
		.filter(x -> x.startsWith("c"))
		.sorted().forEach(x -> System.out.println(x));
		System.out.println("\n--\n");
		
		//***********READING FROM FILES *************
		Stream<String>lines = Files.lines(Paths.get("files/wordFile.txt")); //New way of reading files.
		lines.sorted()
		.filter(l -> l.length() > 6)
		.forEach(x -> System.out.print(x + ", "));
		lines.close();
		System.out.println("\n--\n");
		
		//***********CONVERT LIST OF WORDS INTO A COLLECTION *************
		Stream<String> words = Files.lines(Paths.get("files/wordFile.txt"));
		words.filter(x -> x.contains("th")).collect(Collectors.toList()).forEach(x -> System.out.println(x + ", "));
		words.close();
		System.out.println();
		System.out.println("\n--\n");
		
		//***********READING FROM FILES *************
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int)rows.map(x -> x.split(",")).filter(x -> x.length > 3).count();
		System.out.println(rowCount + " good rows..."); //3 rows have a length of 3 or more. 
		rows.close();
	}

}
