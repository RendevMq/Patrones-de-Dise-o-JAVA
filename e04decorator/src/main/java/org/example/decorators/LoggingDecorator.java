package org.example.decorators;


public class LoggingDecorator extends DataSourceDecorator {

    public LoggingDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("LoggingDecorator: Writing data...");
        super.writeData(data);
        System.out.println("LoggingDecorator: Data written successfully.");
    }

    @Override
    public String readData() {
        System.out.println("LoggingDecorator: Reading data...");
        String data = super.readData();
        System.out.println("LoggingDecorator: Data read successfully.");
        return data;
    }
}
