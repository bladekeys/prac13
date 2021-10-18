module com.example.prac13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prac13 to javafx.fxml;
    exports com.example.prac13;
}