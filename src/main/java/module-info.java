module com.example.idz_12 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.datatransfer;


    opens com.example.idz_12 to javafx.fxml;
    exports com.example.idz_12;
}