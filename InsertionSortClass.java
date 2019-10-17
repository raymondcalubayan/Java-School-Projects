import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertionSortClass {


	public static double[] insertionSort(int numberOfItems, String fileName) throws FileNotFoundException
	{	
		double list[] = new double[numberOfItems];

		File file = new File(fileName);

		Scanner scan = new Scanner(file); 

		int i = 0;

		while (scan.hasNextDouble()){
			list[i] = scan.nextDouble();
			i++;

		}
		for (int m = 0; m < list.length; m++) {
		}


		for (int i1 = 0; i1 < numberOfItems-1; i1++)
			for (int j = 0; j < numberOfItems-i1-1; j++)
				if (list[j] < list[j+1])

				{	
					double temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
		scan.close();
		return list;
	}
}

