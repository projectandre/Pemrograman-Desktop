/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreagung_2007051035_camera;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import kamera.db.DBHandler;
import kamera.model.Kamera;

/**
 *
 * @author ANDRE
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button btnSave;

    @FXML
    private TextField tfNama;

    @FXML
    private TextField tfAlamat;

    @FXML
    private DatePicker dpTanggalSewa;

    @FXML
    private RadioButton rdLaki;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton rdPerempuan;

    @FXML
    private TextField tfJenis;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println(tfNama.getText());
        System.out.println(tfAlamat.getText());
        System.out.println(dpTanggalSewa.getValue().toString());
        String gender="";
        if (rdLaki.isSelected())
           gender=rdLaki.getText();
        if (rdPerempuan.isSelected())
           gender=rdPerempuan.getText();
        
        System.out.println(gender);
        System.out.println(tfJenis.getText());
//        Mahasiswa(String npm, String nama, String tanggalLahir, String gender, String prodi)
        Kamera kmr = new Kamera(tfNama.getText(),tfAlamat.getText(),dpTanggalSewa.getValue().toString(),
            gender,tfJenis.getText());
        DBHandler dh = new DBHandler("MYSQL");
        dh.addKamera(kmr);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
