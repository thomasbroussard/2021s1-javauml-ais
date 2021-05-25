import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * THis is test case that does...
 */
public class MnistImageReaderTest {

	public static void main(String[] args) throws IOException {
		File file = new File("S:\\Work\\ae\\Epita\\workspaces\\2021s1-javauml-ais\\mob-programming-project\\mnist_test.csv");
		List<Image> images = ImageReader.read(file);
		images.sort(Comparator.comparingInt(Image::getLabel));

		Map<Integer, Integer> distributionMap = new LinkedHashMap<>();

		for (Image image : images){
			int currentLabel = image.getLabel();
			Integer count = distributionMap.computeIfAbsent(currentLabel, label -> 0);
			distributionMap.put(currentLabel, count + 1);
		}
		System.out.println(distributionMap);


	}
}
