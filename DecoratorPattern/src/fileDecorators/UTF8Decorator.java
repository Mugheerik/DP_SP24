/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileDecorators;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sp21-bse-017
 */
public class UTF8Decorator extends DataSourceDecorator {
    private DataSource dataSource;

    public UTF8Decorator(DataSource dataSource) {
        super(dataSource);
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        try {
            String utf8Data = new String(data.getBytes(), "UTF-8");
            dataSource.writeData(utf8Data);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UTF8Decorator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String readData() {
        try {
            String data = dataSource.readData();
            return new String(data.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UTF8Decorator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
