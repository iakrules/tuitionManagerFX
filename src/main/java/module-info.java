module com.example.tuitionmanagerfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tuitionmanagerfx to javafx.fxml;
    exports com.example.tuitionmanagerfx;
}