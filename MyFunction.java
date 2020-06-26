public static void main(String[] args) {
	MyFunction();
}

public static void MyFunction() {
	FileReader fileReader = new FileReader("c:\\test.txt");
	BufferedReader reader = new BufferedReader(fileReader);

	String line = reader.readLine();

	while (line != null) {
		System.out.println(line);
		line = reader.readLine();
	}
}
