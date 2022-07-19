package com.example.demo.io;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String folderPath = sc.nextLine();
		sc.close();

		processFiles(folderPath);

	}

	public static void processFiles(String folderPath) {

		List<String> fileNames = getFileNames(folderPath);

		fileNames.forEach(fileName -> {

			File file = new File(Path.of(folderPath, fileName).toString());

			if (!file.exists())
				throw new RuntimeException(file.getAbsolutePath());

			System.out.println("fileName:" + file.getName());
		});
	}

	public static List<String> getFileNames(String folderPath) {

		File folder = new File(folderPath);

		if (!folder.exists())
			throw new RuntimeException("folder not found" + folderPath);

		List<String> fileNames = new ArrayList<>();
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			File tmp = listOfFiles[i];

			if (tmp.isFile()) {

				fileNames.add(tmp.getName());
			}
		}
		return fileNames;
	}

}
