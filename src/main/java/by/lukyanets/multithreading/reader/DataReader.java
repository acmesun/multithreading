package by.lukyanets.multithreading.reader;

import by.lukyanets.multithreading.exception.ThreadException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);

    public List<String> reader(String fileName) throws ThreadException {
        try {
            logger.info("Reading data from file {}", fileName);
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            logger.error("Reading from file {} failed", fileName);
            throw new ThreadException();
        }
    }
}
