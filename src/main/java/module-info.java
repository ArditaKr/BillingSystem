module com.example.billingsystem {
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires javafx.fxml;
     requires mysql.connector.java;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.billingsystem to javafx.fxml;
    exports com.example.billingsystem;
    exports com.example.billingsystem.Controllers;
    opens com.example.billingsystem.Controllers to javafx.fxml;
    exports com.example.billingsystem.Database;
    opens com.example.billingsystem.Database to javafx.fxml;
}