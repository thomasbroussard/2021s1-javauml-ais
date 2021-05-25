import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageReader {

	public static final int IMAGE_HEIGHT = 28;
	public static final int IMAGE_WIDTH = 28;


	public static List<Image> read(File file){
		List<Image> images = new ArrayList<>();


		return images;
	}

	private static double[][] convertToMatrix(String[] parts) {
		double[][] matrix = new double[IMAGE_HEIGHT][IMAGE_WIDTH];
		for (int i = 0; i < IMAGE_HEIGHT; i ++){
			for (int j = 0; j < IMAGE_WIDTH; j++){
				matrix[i][j]  = Double.parseDouble(parts[i * IMAGE_HEIGHT + j]);
			}
			System.out.println();
		}
		return matrix;
	}

}
