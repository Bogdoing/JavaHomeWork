module com.example.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task5_stroitel to javafx.fxml;
    exports com.example.task5_stroitel;
}