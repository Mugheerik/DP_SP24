/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileDecorators;

/**
 *
 * @author sp21-bse-017
 */

public class Demo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nMugheer Islam,100000\nAbdullah Swati,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new UTF8Decorator(
                                                 new FileDataSource("OutputDemo.txt"))));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
